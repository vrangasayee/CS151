/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFxDemos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author narayan
 */
public class Converter extends Application implements EventHandler<ActionEvent> {
    TextField dollar = new TextField();
    TextField pound = new TextField();
    
    @Override
    public void start(Stage primaryStage){
        Stage stage = new Stage();
        
        
        Label dollarLabel = new Label("Dollar");
        Label poundLabel = new Label("Pound");
        Button convertBtn = new Button("Convert");

        
        FlowPane fp = new FlowPane();
        fp.getChildren().add(dollarLabel);
        fp.getChildren().add(dollar);
        fp.getChildren().add(poundLabel);
        fp.getChildren().add(pound);
        fp.getChildren().add(convertBtn);
        
        convertBtn.setOnAction(this);
        convertBtn.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                DropShadow shadow = new DropShadow();
                convertBtn.setEffect(shadow);
            }
            
        });
        
        convertBtn.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                DropShadow shadow = new DropShadow();
                convertBtn.setEffect(null);
            }
            
        });
        stage.setScene(new Scene(fp, 200,100));
        stage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        Double dollars = Double.valueOf(dollar.getText());
	pound.setText(Double.toString(dollars * 0.731421884));
    }
    
}
