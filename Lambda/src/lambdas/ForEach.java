/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author danecek
 */
public class ForEach {

    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        Collections.addAll(l, "Tom", "Jerry");
        l.forEach(e -> System.out.println(e));

    }

}
