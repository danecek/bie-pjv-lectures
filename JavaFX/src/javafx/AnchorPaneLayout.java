/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author danecek
 */
public class AnchorPaneLayout extends Application {

    AnchorPane createAnchorPane() {
        AnchorPane anchorPane = new AnchorPane();
        Button tl = new Button("Anchored Bottom Right");
        anchorPane.getChildren().add(tl);
        AnchorPane.setBottomAnchor(tl, 15.);
        AnchorPane.setRightAnchor(tl, 15.);
        return anchorPane;
    }

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(createAnchorPane());

        primaryStage.setTitle("AnchorPaneLayout");
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
