/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.application.Application;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.StringConverter;

/**
 *
 * @author danecek
 */
public class Convertor extends Application {

    @Override
    public void start(Stage primaryStage) {
        Text text = new Text();
        TextField tf = new TextField();
        SimpleDoubleProperty sip = new SimpleDoubleProperty();
        tf.textProperty().bindBidirectional(sip, new StringConverter<Number>() {

            @Override
            public Number fromString(String string) {
                try {
                    return new Double(string);
                } catch (NumberFormatException ex) {
                    return Double.NaN;
                }
            }

            @Override
            public String toString(Number object) {
                return object.toString();
            }
        });
        DoubleBinding b = sip.multiply(2);
        b.addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                text.setText(newValue.toString());
            }
        });

        // text.textProperty().bindBidirectional(sip, new NumberStringConverter());
        VBox hb = new VBox();
        hb.getChildren().addAll(text, tf);

        Scene scene = new Scene(hb, 300, 250);

        primaryStage.setTitle("Bindings");
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
