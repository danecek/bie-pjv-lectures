/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.io.Console;
import java.util.stream.Stream;

/**
 *
 * @author danecek
 */
public class Streams {
    public static void main(String[] args) {
        Stream<String> strings = Stream.of("A", "B", "C");
        strings.forEach(e -> System.out.printf("%s, ", e));
    }
}
