package dnd.characterCreator.gui.control;

import dnd.characterCreator.character.Player;
import dnd.characterCreator.character.classes.Classes;
import dnd.characterCreator.character.classes.Wizard;
import dnd.characterCreator.gui.ControlledScreen;
import dnd.characterCreator.gui.ScreensController;
import dnd.characterCreator.gui.ScreensFramework;
import dnd.characterCreator.utility.Utility;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ChooseClassController implements ControlledScreen {
	private ScreensController myController;
	
	@FXML
	private Button btn_barbarian, btn_bard, btn_cleric, btn_druid, btn_fighter, btn_monk, btn_paladin, btn_rogue, btn_sorcerer, btn_warlock, btn_wizard, btn_random;
	@FXML
	private Button btn_previous;
	
	@FXML
	public void initialize() {
		btn_wizard.setOnAction(e -> goToAbilityScores(new Wizard()));
		btn_random.setOnAction(event -> goToAbilityScores(Utility.randomClass()));
		
		btn_previous.setOnAction(event -> goToPreviousScreen());
	}
	
	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}
	
	private void goToPreviousScreen() {
		myController.setScreen(ScreensFramework.CHOOSE_RACE_SCREEN);
	}
	
	private void goToAbilityScores(Classes classes) {
		Player.playerCharacter.setClass(classes);
		myController.setScreen(ScreensFramework.MAIN_MENU_SCREEN);
	}
}
