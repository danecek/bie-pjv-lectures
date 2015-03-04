/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author danecek
 */
public class Synchron extends Thread {

    static int shared;
    static Object lock = new Object();

    @Override
    public void run() {
        for (;;) {
            synchronized (lock) {
                shared++;
            }
        }
    }

    public static void main(String[] args) {
        new Synchron().start();
        new Synchron().start();
    }

}
