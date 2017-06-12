package dnd.characterCreator.gui.control;

import dnd.characterCreator.character.Player;
import dnd.characterCreator.gui.ControlledScreen;
import dnd.characterCreator.gui.ScreensController;
import dnd.characterCreator.gui.ScreensFramework;
import dnd.characterCreator.utility.Utility;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainMenuController implements ControlledScreen {
	private ScreensController myController;
	
	@FXML
	private Button btn_mainMenu, btn_random;
	
	@FXML
	public void initialize() {
		btn_mainMenu.setOnAction(event -> goToChooseRace());
		btn_random.setOnAction(event -> generateRandomCharacter());
	}
	
	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}
	
	private void goToChooseRace() {
		Player.playerCharacter = new Player();
		myController.setScreen(ScreensFramework.CHOOSE_RACE_SCREEN);
	}
	
	private void generateRandomCharacter() {
		System.out.println(Utility.randomRace().getRaceName());
		System.out.println(Utility.randomClass().getClassName());
	}
}
