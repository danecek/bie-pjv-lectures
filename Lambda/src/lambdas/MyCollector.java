/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author danecek
 */
public class MyCollector {

    static class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    static void genMap() {
        Map<Integer, Person> pm = Stream.of(new Person("Tom", 34),
                new Person("Jane", 24)).collect(
                Collectors.toMap(p -> p.age, Function.identity()));
        System.out.println(pm);

    }

    static void x() {
        List<String> ls = new ArrayList<>();
        Stream.of("A", "B").forEach(s -> ls.add(s));
        System.out.println(ls);
        List<String> ls2 = Stream.of("A", "B").collect(Collectors.toList());
        System.out.println(ls2);
    }

    public static void main(String[] args) {
        genMap();
        BiConsumer<List<String>, String> accumulator = (stringList, string) -> {
            stringList.add(string);
        };

        BinaryOperator<List<String>> combiner
                = (stringList, stringList2) -> {
                    stringList.addAll(stringList2);
                    return stringList;
                };

        Collector toListCollector = Collector.of(ArrayList<String>::new,
                accumulator,
                combiner);
        Stream<String> stringStream = Stream.of("xxx", "yyy");
        List<String> sl = (List<String>) stringStream.collect(toListCollector);
        System.out.println(sl);

    }

}
