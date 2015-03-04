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
public class Sleep implements Runnable {

    @Override
    public void run() {
        for (;;) {
            try {
                Thread.sleep(1000);
                System.out.println("it slept 1 sec");
            } catch (InterruptedException ie) {
                System.out.println("it was forced to wake up");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Sleep());
        t.start();
        t.interrupt();
    }

}
