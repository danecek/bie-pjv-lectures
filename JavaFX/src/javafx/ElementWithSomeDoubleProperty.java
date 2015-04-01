package javafx;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class ElementWithSomeDoubleProperty {

    // Define a variable to store the property
    private final DoubleProperty someDoubleProperty = new SimpleDoubleProperty();

    // Define a getter for the property's value
    public final double getSomeDoubleProperty() {
        return someDoubleProperty.get();
    }

    // Define a setter for the property's value
    public final void setSomeDoubleProperty(double value) {
        someDoubleProperty.set(value);
    }

    // Define a getter for the property itself
    public DoubleProperty someDoubleProperty() {
        return someDoubleProperty;
    }

}
