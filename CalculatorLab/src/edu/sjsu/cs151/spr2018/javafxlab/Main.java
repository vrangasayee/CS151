package edu.sjsu.cs151.spr2018.javafxlab;
	
import edu.sjsu.cs151.spr2018.javafxlab.model.CalculatorModel;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

// TODO(you): make Main implement ModelListener
public class Main extends Application implements EventHandler<ActionEvent> {
	CalculatorModel model = new CalculatorModel();
	Label result = new Label();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			String[][] keys = {
					{"AC", "±", "%", "/"},
					{"7", "8", "9", "*"},
					{"4", "5", "6", "-"},
					{"1", "2", "3", "+"},
					{"0", "0", ".", "="}
			};
			
			result.setMinWidth(200);
			result.setAlignment(Pos.CENTER_RIGHT);
			// TODO(you): attach this class as a listener for Model so you can update the result
			
			GridPane keypad = new GridPane();
			for(int row = 0; row < keys.length; row++) {
				for (int col = 0; col < keys[row].length; col++) {
					Button b = new Button(keys[row][col]);
					GridPane.setColumnIndex(b, col);
					GridPane.setRowIndex(b, row);
					
					b.setMinWidth(50);
					
					// TODO(you): 0 key is special - make it wider
					// HINT: use GridPane.setColumnSpan and b.setMinWidth
					if ("0".equals(b.getText())) {
						col++;
					}
					
					// TODO(you): make "this" the actionListener/eventHandler for button b.
					
					keypad.getChildren().add(b);
					
				}
			}
			
			// TODO(you): Create a new Vertical Box (@VBox)
			// TODO(you): Add the result and keypad to the vbox.
			// and replace the keypad with the vbox in the scene below
			Scene scene = new Scene(keypad);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() instanceof Button) {
			Button b = (Button) event.getSource();
			model.handleInput(b.getText());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
