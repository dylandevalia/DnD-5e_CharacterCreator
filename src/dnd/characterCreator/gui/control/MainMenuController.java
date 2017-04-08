package dnd.characterCreator.gui.control;

import dnd.characterCreator.character.Player;
import dnd.characterCreator.gui.ControlledScreen;
import dnd.characterCreator.gui.ScreensController;
import dnd.characterCreator.gui.ScreensFramework;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainMenuController implements ControlledScreen {
	private ScreensController myController;
	
	@FXML
	private Button btn_mainMenu;
	
	@FXML
	public void initialize() {
		btn_mainMenu.setOnAction(event -> goToChooseRace());
	}
	
	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}
	
	private void goToChooseRace() {
		Player.playerCharacter = new Player();
		myController.setScreen(ScreensFramework.CHOOSE_RACE_SCREEN);
	}
}
