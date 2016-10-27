package lambdas;

import java.util.function.Function;

public class SquareRoot implements Function<Integer, Double> {

    @Override
    public Double apply(Integer t) {
        return Math.sqrt(t);
    }
    
    public static void main(String[] args) {
        System.out.println(new SquareRoot().apply(2));
    }

}
