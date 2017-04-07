package dnd.characterCreator.gui.control;

import dnd.characterCreator.gui.ControlledScreen;
import dnd.characterCreator.gui.ScreensController;
import dnd.characterCreator.gui.ScreensFramework;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class NewScreenController implements ControlledScreen {
	
	private ScreensController myController;
	
	@FXML
	private Button btn_mainMenu;
	
	@FXML
	public void initialize() {
		btn_mainMenu.setOnAction(event -> goToMainMenu());
	}
	
	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}
	
	private void goToMainMenu() {
		myController.setScreen(ScreensFramework.MAIN_SCREEN);
	}
}
