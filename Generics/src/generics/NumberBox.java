package generics;

public class NumberBox<T extends Number> {

    private T n;

    public NumberBox(T n) {
        this.n = n;
    }

    public boolean isZero() {
        return getN().doubleValue() == 0; // Number.intValue
    }

    public static void main(String[] args) {

        NumberBox<Integer> integerBox = new NumberBox<>(1);
        //         NumberBox<String> stringBox = new NumberBox<>("xxx");
        integerBox.setN(1); // Ok
        //     integerBox.setN("some text");
    }

    /**
     * @return the n
     */
    public T getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(T n) {
        this.n = n;
    }

}
