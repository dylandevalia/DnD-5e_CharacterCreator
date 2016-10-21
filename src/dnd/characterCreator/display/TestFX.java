package dnd.characterCreator.display;

import dnd.characterCreator.utility.Dice;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TestFX extends Application
{
	private Dice d20 = new Dice(20);
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage)
	{
		Button btn = new Button("Click Me"); // Makes a button
		btn.setOnAction(e -> btn_click()); // On click run btn_click() [lambda function]
		StackPane frame = new StackPane();
		frame.getChildren().add(btn); // Add button to frame
		Scene scene = new Scene(frame, 700, 500); // Create stage for the frame
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello World");
		primaryStage.show();
	}
	
	public void btn_click()
	{
		System.out.println(d20.roll());
	}
}
