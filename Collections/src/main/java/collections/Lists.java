/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danecek
 */
public class Lists {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(new Point(1, 2));
        list.add(new Point(1, 2));
        list.add(1, new Point(2, 4));
        System.out.println(list);   // [[1, 2], [2, 4], [1, 2]]
        System.out.println(list.get(2)); // [1, 2]
    }

}
