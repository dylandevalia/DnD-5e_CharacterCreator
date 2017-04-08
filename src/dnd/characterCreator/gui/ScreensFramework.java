package dnd.characterCreator.gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class which should be called to run the program
 */
public class ScreensFramework extends Application {
	public static final String MAIN_MENU_SCREEN = "mainMenu";
	public static final String MAIN_MENU_SCREEN_FXML = "view/mainMenu.fxml";
	public static final String CHOOSE_RACE_SCREEN = "chooseRace";
	public static final String CHOOSE_RACE_SCREEN_FXML = "view/chooseRace.fxml";
	public static final String CHOOSE_CLASS_SCREEN = "chooseClass";
	public static final String CHOOSE_CLASS_SCREEN_FXML = "view/chooseClass.fxml";
	
	/**
	 * Creates window and points it to the fxml file
	 *
	 * @param primaryStage The stage on which to show the window
	 */
	@Override
	public void start(Stage primaryStage) {
		ScreensController mainContainer = new ScreensController();
		
		mainContainer.loadScreen(ScreensFramework.MAIN_MENU_SCREEN, ScreensFramework.MAIN_MENU_SCREEN_FXML);
		mainContainer.loadScreen(ScreensFramework.CHOOSE_RACE_SCREEN, ScreensFramework.CHOOSE_RACE_SCREEN_FXML);
		mainContainer.loadScreen(ScreensFramework.CHOOSE_CLASS_SCREEN, ScreensFramework.CHOOSE_CLASS_SCREEN_FXML);
		
		mainContainer.setScreen(ScreensFramework.MAIN_MENU_SCREEN);
		
		Group root = new Group();
		root.getChildren().addAll(mainContainer);
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	/**
	 * Main static class
	 *
	 * @param args Argument to be passed in
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
