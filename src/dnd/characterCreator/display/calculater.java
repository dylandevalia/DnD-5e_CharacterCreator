package dnd.characterCreator.display;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class calculater extends Application
{
	
	TextField txtnum1, txtnum2;
	Button btnAdd, btnSub, btnMul, btnDiv, btnClear;
	Label lblAnswer;
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage)
	{
		// Make controls
		txtnum1 = new TextField();
		txtnum2 = new TextField();
		btnAdd = new Button("+");
		btnSub = new Button("-");
		btnMul = new Button("*");
		btnDiv = new Button("/");
		btnClear = new Button("Clear");
		lblAnswer = new Label("?");
		lblAnswer.setAlignment(Pos.CENTER); // Set centered text
		lblAnswer.setStyle("-fx-border-color: #000; -fx-padding: 5px"); // CSS-like styling
		
		GridPane root = new GridPane(); // Make controller for app
		root.setAlignment(Pos.CENTER); // Puts container onto the middle of the screen
		// Sets spacing between controls in grid
		root.setHgap(10);
		root.setVgap(10);
		// Add to grid
		root.add(btnAdd, 0, 0);
		root.add(btnSub, 1, 0);
		root.add(btnMul, 0, 1);
		root.add(btnDiv, 1, 1);
		root.add(txtnum1, 0, 2);
		root.add(txtnum2, 1, 2);
		root.add(lblAnswer, 0, 3, 2, 1); // col, row, colSpan, rowSpan
		root.add(btnClear, 0, 4, 2, 1);
		
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("Calc");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void setWidths()
	{
		txtnum1.setPrefWidth(70);
		txtnum2.setPrefWidth(70);
		btnAdd.setPrefWidth(70);
		btnSub.setPrefWidth(70);
		btnMul.setPrefWidth(70);
		btnDiv.setPrefWidth(70);
		btnClear.setPrefWidth(150);
		lblAnswer.setPrefWidth(150);
	}
	
	public void attachCode()
	{
		btnAdd.setOnAction(e -> btnCode(e));
		btnSub.setOnAction(e -> btnCode(e));
		btnMul.setOnAction(e -> btnCode(e));
		btnDiv.setOnAction(e -> btnCode(e));
		btnClear.setOnAction(e -> btnCode(e));
	}
	
	public void btnCode(ActionEvent e)
	{
		int num1, num2, answer;
		char symbol;
		// e say which button was clicked
		if (e.getSource()==btnClear)
		{
			txtnum1.setText("");
			txtnum2.setText("");
			lblAnswer.setText("?");
			txtnum1.requestFocus();
			return;
		}
		
		num1 = Integer.parseInt((txtnum1.getText()));
		num2 = Integer.parseInt((txtnum2.getText()));
		if (e.getSource() == btnAdd)
		{
			symbol = '+';
			answer = num1 + num2;
		} else if (e.getSource() == btnSub)
		{
			symbol = '-';
			answer = num1 - num2;
		} else if (e.getSource() == btnMul)
		{
			symbol = '*';
			answer = num1 * num2;
		} else
		{
			symbol = '/';
			answer = num1 / num2;
		}
		 
		lblAnswer.setText("" + num1 + " " + symbol + " " + num2 + " = " + answer);
	}
	
}
