/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *
 * @author danecek
 */
public class MethodRef {

    public static void main(String[] args) {
        Function<Integer, String> smr = String::valueOf;
        Function<Integer, String> smr2 = (Integer i) -> String.valueOf(i);
        
        BiFunction<String, String, Boolean> imr = String::contains;
        BiFunction<String, String, Boolean> imr2
                = (String s, String ss) -> s.contains(s);
        
        Function<String, Boolean> imr3 = "abcdef"::contains;
        Function<String, Boolean> imr32
                = (String s) -> "abcdef".contains(s);
        
        Supplier<List<String>> nr = ArrayList::new;
        Supplier<List<String>> nr2 = () -> new ArrayList<>();

    }
}
