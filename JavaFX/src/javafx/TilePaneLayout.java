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
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

/**
 *
 * @author danecek
 */
public class TilePaneLayout extends Application {

    public static TilePane createTilePane() {
        TilePane tiles = new TilePane(Orientation.HORIZONTAL);
        tiles.setPadding(new Insets(5));
        tiles.setVgap(5);
        tiles.setHgap(5);
        tiles.setPrefColumns(2);
        tiles.setStyle("-fx-background-color: DAE6F3;");
        for (String t : new String[]{"One", "Two", "Three", "Four", "Five",}) {
            tiles.getChildren().add(new Button(t));
        }
        return tiles;
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(createTilePane());
        primaryStage.setTitle("TilePaneLayout");
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
