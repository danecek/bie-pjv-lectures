/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author danecek
 */
public class JavaFX extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Hello World");
        Scene s = new Scene(new Label("Hello"), 800, 600);
        primaryStage.setScene(s);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

}
