/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author danecek
 */
public class Wildcard {

    static void printList(List<Object> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    public static void printListW(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        //   printList(li); 
        printListW(li);
        List<Object> lo = new ArrayList<>();
        addNumber(lo, 3);  // ok - you can add integer to objects
        List<String> ls = new ArrayList<>();
        // addNumber(ls, 3);
        // error: incompatible types: List<String> cannot be converted to List<? super Integer>
        List<Number> ln = new ArrayList<>();
        boolean b = ls.getClass() == ln.getClass(); // true
        // b = ln instanceof List<Number>; //  error: illegal generic type for instanceof
        List rawList = new ArrayList<String>();
        rawList.add("hello");
       // warning: [unchecked] unchecked call to add(E) as a member of the raw type List
        List<Integer> intList = rawList; //  warning: [unchecked] unchecked conversion
        intList.get(0).intValue(); // runtime error
        ((Integer) intList.get(0)).intValue(); // real bytecode
    }

    static double sum(List<? extends Number> ln) {
        double total = 0;
        for (Number n : ln) //  n is of some subtype of Number
        {
            total += n.doubleValue();
        }
        // doubleValue is defined in Number
        return total;
    }

    static void addNumber(List<? super Integer> list,
            Integer n) {
        list.add(n);
    }

}
