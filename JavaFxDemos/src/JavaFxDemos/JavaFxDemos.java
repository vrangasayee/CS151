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
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author narayan
 */
public class JavaFxDemos extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn1 = new Button("BasicJavaFx");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                BasicJavaFx demo1 = new BasicJavaFx();
                demo1.start(primaryStage);
            }
            
        });
        Button btn2 = new Button("Buttons And Labels");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonsAndLabels demo1 = new ButtonsAndLabels();
                demo1.start(primaryStage);
            }
            
        });
        Button btn3 = new Button("Converter");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Converter demo1 = new Converter();
                demo1.start(primaryStage);
            }
            
        });
        Button btn4 = new Button("Effects");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                EffectsAndGraphics demo1 = new EffectsAndGraphics();
                demo1.start(primaryStage);
            }
            
        });
        
        VBox fp = new VBox();
        fp.getChildren().add(btn1);
        fp.getChildren().add(btn2);
        fp.getChildren().add(btn3);
        fp.getChildren().add(btn4);
        
        Scene scene1 = new Scene(fp, 200, 300);
        primaryStage.setWidth(200);
        primaryStage.setHeight(300);
        primaryStage.setScene(scene1);
        primaryStage.show();
        
    }
    
}
