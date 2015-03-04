/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;

public class ArrayIterator implements Iterator<Integer> {

    private final int[] array;
    private int index = 0;

    ArrayIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public Integer next() {
        return array[index++]; // unboxing
    }

    public static void main(String[] args) {
        for (Iterator i = new ArrayIterator(new int[]{1, 4, 8}); i.hasNext();) {
            System.out.println(i.next());
        }
        // TODO code application logic here
    }
}
