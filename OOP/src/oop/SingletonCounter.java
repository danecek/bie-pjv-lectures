/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author danecek
 */
public class SingletonCounter {

    public static final SingletonCounter instance
            = new SingletonCounter();
    private int counter = 0;

    private SingletonCounter() {
    }

    public int next() {
        return counter++;
    }

    public static void main(String[] args) {
        System.out.println(SingletonCounter.instance.next()); // 0
        System.out.println(SingletonCounter.instance.next()); // 1
        System.out.println(SingletonCounter.instance.next()); // 2
        System.out.println(SingletonCounter.instance.next()); // 3

    }
}
