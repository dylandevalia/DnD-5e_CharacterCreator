package dnd.characterCreator.gui.control;

import dnd.characterCreator.character.Player;
import dnd.characterCreator.character.races.Human;
import dnd.characterCreator.character.races.Races;
import dnd.characterCreator.gui.ControlledScreen;
import dnd.characterCreator.gui.ScreensController;
import dnd.characterCreator.gui.ScreensFramework;
import dnd.characterCreator.utility.Utility;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ChooseRaceController implements ControlledScreen {
	private ScreensController myController;
	
	@FXML
	private Button btn_dragonborn, btn_dwarf, btn_elf, btn_gnome, btn_halfElf, btn_halfling, btn_halfOrc, btn_human, btn_tiefling, btn_random;
	
	@FXML
	public void initialize() {
		btn_human.setOnAction(e -> goToChooseClass(new Human()));
		btn_random.setOnAction(event -> goToChooseClass(Utility.randomRace()));
	}
	
	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}
	
	private void goToChooseClass(Races race) {
		Player.playerCharacter.setRace(race);
		myController.setScreen(ScreensFramework.CHOOSE_CLASS_SCREEN);
	}
}
