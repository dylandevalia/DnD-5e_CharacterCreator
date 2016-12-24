package dnd.characterCreator.gui.control;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScreensFramework extends Application {
	
	public static final String MAIN_SCREEN = "main";
	public static final String MAIN_SCREEN_FXML = "../view/main.fxml";
	public static final String NEW_SCREEN = "new";
	public static final String NEW_SCREEN_FXML = "../view/new.fxml";
	
	@Override
	public void start(Stage primaryStage) {
		ScreensController mainContainer = new ScreensController();
		
		mainContainer.loadScreen(ScreensFramework.MAIN_SCREEN, ScreensFramework.MAIN_SCREEN_FXML);
		mainContainer.loadScreen(ScreensFramework.NEW_SCREEN, ScreensFramework.NEW_SCREEN_FXML);
		
		mainContainer.setScreen(ScreensFramework.MAIN_SCREEN);
		
		Group root = new Group();
		root.getChildren().addAll(mainContainer);
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
