/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author danecek
 */
public class FlowPaneLayout extends Application {

    public static FlowPane createFlowPane() {
        FlowPane flow = new FlowPane(Orientation.VERTICAL);
        flow.setPadding(new Insets(5));
        flow.setVgap(4);
        flow.setHgap(4);
        flow.setStyle("-fx-background-color: DAE6F3;");
        for (String t : new String[]{"One", "Two", "Three", "Four", "Five",}) {
            flow.getChildren().add(new Button(t));
        }
        return flow;
    }

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(createFlowPane(), 300, 250);

        primaryStage.setTitle("FlowPaneLayout");
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
