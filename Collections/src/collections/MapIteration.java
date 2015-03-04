/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author danecek
 */
public class MapIteration {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        for (String key : map.keySet()) {
            System.out.printf("%s -> %d\n", key, map.get(key));
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }

    }
}
