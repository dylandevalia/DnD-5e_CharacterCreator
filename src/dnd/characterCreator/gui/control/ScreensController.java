package dnd.characterCreator.gui.control;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.util.HashMap;

public class ScreensController extends StackPane {
	
	private HashMap<String, Node> screens = new HashMap<>();
	
	/**
	 * Adds screen node to hashmap
	 *
	 * @param name   The name of the screen
	 * @param screen Node of the screen
	 */
	public void addScreen(String name, Node screen) {
		screens.put(name, screen);
	}
	
	/**
	 * Loads the screen from the hashmap
	 *
	 * @param name     The name of the screen
	 * @param resource The FXML location
	 * @return True or false if the screen was loaded
	 */
	public boolean loadScreen(String name, String resource) {
		try {
			FXMLLoader myLoader = new FXMLLoader(getClass().getResource(resource));
			Parent loadScreen = (Parent) myLoader.load();
			ControlledScreen myScreenControler = ((ControlledScreen) myLoader.getController());
			myScreenControler.setScreenParent(this);
			addScreen(name, loadScreen);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean unloadScreen(String name) {
		if (screens.remove(name) == null) {
			System.out.println("Screen did not exist");
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * Sets the current screen to given name if exists
	 * Applies a fade animation between the current and given screen
	 *
	 * @param name The name of the screen to switch to
	 * @return True or false if the function was successful
	 */
	public boolean setScreen(final String name) {
		
		if (screens.get(name) != null) {    // Has the screen been loaded
			final DoubleProperty opacity = opacityProperty();
			
			if (!getChildren().isEmpty()) { // Are there multiple screens
				
				Timeline fade = new Timeline(   // Fade animation
						// Start at 100%
						new KeyFrame(javafx.util.Duration.ZERO, new KeyValue(opacity, 1.0)),
						// Over one second fade in new screen
						new KeyFrame(new javafx.util.Duration(1000),
								// Event handler
								new EventHandler<ActionEvent>() {
									@Override
									public void handle(ActionEvent event) {
										getChildren().remove(0);
										
										getChildren().add(0, screens.get(name));
										Timeline fadeIn = new Timeline(
												new KeyFrame(javafx.util.Duration.ZERO, new KeyValue(opacity, 0.0)),
												new KeyFrame(new javafx.util.Duration(800), new KeyValue(opacity, 1.0))
										);
										fadeIn.play();
									}
								}, new KeyValue(opacity, 0.0)
						)
				);
				fade.play();
			} else {    // If nothing else is displayed then just show the screen
				setOpacity(0.0);
				getChildren().add(screens.get(name));
				Timeline fadeIn = new Timeline(new KeyFrame(javafx.util.Duration.ZERO, new KeyValue(opacity, 0.0)),
						new KeyFrame(new javafx.util.Duration(2500), new KeyValue(opacity, 1.0))
				);
				fadeIn.play();
			}
			return true;
		} else {
			System.out.println("Screen hasn't been loaded!\n");
			return false;
		}
	}
}
