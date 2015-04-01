/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author danecek
 */
public class BoundingProperties extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        t1.textProperty().bindBidirectional(t2.textProperty());

        VBox root = new VBox();
        root.setSpacing(10);
        root.setPadding(new Insets(10));
        root.getChildren().addAll(t1, t2);

        Scene scene = new Scene(root);//, 300, 250);

        primaryStage.setTitle("Property Binding");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
