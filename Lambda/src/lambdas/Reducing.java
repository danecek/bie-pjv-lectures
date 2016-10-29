/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author danecek
 */
public class Reducing {

    public static void main(String[] args) {
        Stream<Integer> streamInts = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> totalSum = streamInts.reduce((a, b) -> a + b);
        System.out.println(totalSum);
        Stream<Integer> possibleEmptyStream = Stream.empty();
        int product = possibleEmptyStream.reduce(1, (a, b) -> a * b);
  
    }
}
