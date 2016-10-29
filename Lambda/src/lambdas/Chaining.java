/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.util.stream.Stream;

/**
 *
 * @author danecek
 */
public class Chaining {

    public static void main(String[] args) {
        Stream<String> strings = Stream.of("A", "B", "", "C");
        strings.filter(sf -> !sf.isEmpty())
                .map(sm -> sm.toLowerCase())
                .forEach(sf -> System.out.printf("%s, ", sf));//a, b, c,
    }
}
