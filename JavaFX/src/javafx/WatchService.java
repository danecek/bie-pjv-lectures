/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import java.util.Date;
import javafx.application.Application;
import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author danecek
 */
public class WatchService extends Application {

    static class MyService extends ScheduledService<Date> {

        public MyService() {
            setPeriod(new Duration(1000));
        }

        @Override
        protected Task<Date> createTask() {
            return new Task<Date>() {

                @Override
                protected Date call() throws Exception {
                    return new Date();
                }
            };
        }
    }

    @Override
    public void start(Stage primaryStage) {
        Label l = new Label();
        StackPane root = new StackPane();
        root.getChildren().add(l);
        Scene scene = new Scene(root, 300, 250);
        MyService ms = new MyService();
        l.textProperty().bind(ms.lastValueProperty().asString());
        ms.start();
        primaryStage.setTitle("Hello World!");
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
