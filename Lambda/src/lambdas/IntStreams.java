package lambdas;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreams {

    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(10, 12).sum());
        Stream<String> ss = Stream.of("10", "11", "12");
        int totalSum = ss.mapToInt(s -> Integer.parseInt(s)).sum();
        System.out.println(totalSum);
    }
}
