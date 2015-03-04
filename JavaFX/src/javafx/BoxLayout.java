/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author danecek
 */
public class BoxLayout extends Application {

    public static HBox addHBox() {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(10);

        //hbox.setStyle("-fx-background-color: #336699;");
        Button buttonCurrent = new Button("Current");
        //  buttonCurrent.setPrefSize(100, 20);
        Button buttonProjected = new Button("Projected");
        //  buttonProjected.setPrefSize(100, 20);
        hbox.getChildren().addAll(buttonCurrent,
                buttonProjected);
        return hbox;
    }

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(addHBox(), 300, 250);

        primaryStage.setTitle("BoxLayout");
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
