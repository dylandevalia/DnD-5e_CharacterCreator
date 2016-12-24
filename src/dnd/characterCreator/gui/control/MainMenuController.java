package dnd.characterCreator.gui.control;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainMenuController implements ControlledScreen {
	
	private ScreensController myController;
	@FXML
	private Button btn_newScreen;
	
	@FXML
	public void initialize() {
		btn_newScreen.setOnAction(event -> {
			goToNewScreen();
		});
	}
	
	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}
	
	@FXML
	private void goToNewScreen() {
		myController.setScreen(ScreensFramework.NEW_SCREEN);
	}
}
