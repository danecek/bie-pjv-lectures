/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ObservableDoubleValue;

/**
 *
 * @author danecek
 */
public class SquareBinding extends DoubleBinding {

    ObservableDoubleValue r;

    public SquareBinding(ObservableDoubleValue r) {
        this.r = r;
        bind(r);
    }

    public static void main(String[] args) {
        ObservableDoubleValue r = new SimpleDoubleProperty(2);
        DoubleBinding sqr = new SquareBinding(r);
        DoubleBinding circleArea = sqr.multiply(Math.PI);
        System.out.println(circleArea.get());
    }

    @Override
    protected double computeValue() {
        return r.get() * r.get();
    }

}
