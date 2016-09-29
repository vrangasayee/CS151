/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFxDemos;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author narayan
 */
public class EffectsAndGraphics extends Application{
    static Node blendMode() {
        Rectangle r = new Rectangle();
        r.setX(590);
        r.setY(50);
        r.setWidth(50);
        r.setHeight(50);
        r.setFill(Color.BLUE);
 
        Circle c = new Circle();
        c.setFill(Color.rgb(255, 0, 0, 0.5f));
        c.setCenterX(590);
        c.setCenterY(50);
        c.setRadius(25);
 
        Group g = new Group();
        g.setBlendMode(BlendMode.MULTIPLY);
        g.getChildren().add(r);
        g.getChildren().add(c);
        return g;
    }

    @Override
    public void start(Stage primaryStage) {
        Stage stage = new Stage();
        FlowPane fp = new FlowPane();
        fp.getChildren().add(blendMode());
        stage.setScene(new Scene(fp, 200,100));
        stage.show();
    }
    
    
    
}
