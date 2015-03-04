/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author danecek
 */
public class Binding extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text t = new Text();
        TextField tf = new TextField();
        tf.textProperty().bindBidirectional(t.textProperty(), new Format() {

            @Override
            public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {

                toAppendTo.append(obj.toString());
                return toAppendTo;
            }

            @Override
            public Object parseObject(String source, ParsePosition pos) {
                try {
                    pos.setIndex(source.length());
                    int i = Integer.parseInt(source);
                    return Integer.toString(i*i);
                } catch (NumberFormatException ex) {
                    return "error";
                }

            }
        });
        VBox vbox = new VBox(t, tf);

        Scene s = new Scene(vbox, 300, 300);

        primaryStage.setScene(s);
        primaryStage.setTitle("Bindings");
        primaryStage.centerOnScreen();
                primaryStage.setFullScreen(true);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
