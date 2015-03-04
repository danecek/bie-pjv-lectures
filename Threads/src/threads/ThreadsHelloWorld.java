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
public class ThreadsHelloWorld extends Thread {

    public ThreadsHelloWorld(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ThreadsHelloWorld("1").start();
        new ThreadsHelloWorld("2").start();
        // TODO code application logic here
    }

}
