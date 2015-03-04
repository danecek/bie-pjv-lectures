/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author danecek
 */
public class WatchTask extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label l = new Label();
        StackPane root = new StackPane();
        root.getChildren().add(l);
        Scene scene = new Scene(root, 300, 250);
        
        Task<Date> task = new Task<Date>() {
            @Override
            public Date call() {
                for (;;) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(WatchTask.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (isCancelled()) {
                        return new Date();
                    }
                    this.updateValue(new Date());
                }

            }
        };
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {

            @Override
            public void handle(WindowEvent event) {
                task.cancel();
            }
        });

        l.textProperty().bind(task.valueProperty().asString());
        new Thread(task).start();
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
