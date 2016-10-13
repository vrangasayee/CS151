
import javafx.application.Application;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author narayan
 */
public class McPatterns extends Application {
    public static void main(String [] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        McPatternsGUI app = new McPatternsGUI(new McPatternsPresenter());
        app.start(primaryStage); //To change body of generated methods, choose Tools | Templates.
    }
    
}
