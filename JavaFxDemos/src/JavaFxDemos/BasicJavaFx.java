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
import javafx.scene.control.Slider;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author narayan
 */
public class BasicJavaFx extends Application {

    @Override
    public void start(Stage stage){
        
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Basic Javafx");
        
        FlowPane fp = new FlowPane();
        fp.getChildren().add(new Label("Hello World"));
        fp.getChildren().add(new Slider());
        fp.getChildren().add(new Button("ok"));
        Button test = new Button("test");
        test.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("test");
            }
        });
        fp.getChildren().add(test);
        
        Scene scene = new Scene(fp, 500, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
}
