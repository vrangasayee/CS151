/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author narayan
 */
public class McPatternsGUI extends Application {
    McPatternsPresenter presenter;
    
    public McPatternsGUI(McPatternsPresenter presenter) {
        this.presenter = presenter;
        presenter.attachView(this);
    }
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane ui = new BorderPane();
        // Top Pane
        HBox titlePane = new HBox();
        titlePane.getChildren().add(new Label("Welcome to McPatterns"));
        titlePane.setAlignment(Pos.CENTER);
        titlePane.setStyle(STYLESHEET_MODENA);
        
        //Right Pane
        VBox orderPane = new VBox();
        orderPane.getChildren().add(new Label("Your Order:"));
        // Add order details below this label
        orderPane.getChildren().add(new TextField("Enter your CC#"));
        
        Button confirm = new Button("Confirm");
        confirm.setOnMouseReleased(e -> {
            // Add a call to confirm the order
        });
        
        orderPane.getChildren().add(confirm);
        
        Button cancel = new Button("Cancel");
        cancel.setCancelButton(true);
        orderPane.getChildren().add(cancel);
        
        //Center Pane
        FlowPane menuPane = new FlowPane();
        menuPane.getChildren().add(new Button("Replace with menu buttons"));
        
        ui.setTop(titlePane);
        ui.setRight(orderPane);
        ui.setCenter(menuPane);
        Scene scene = new Scene(ui, 500, 500);
        
        primaryStage.setTitle("McPatterns");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
