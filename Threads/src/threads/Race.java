/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danecek
 */
public class Race extends Thread {

    public Race(String name) {
        super(name);
    }

    static int shared;
    int counter;

    @Override
    public void run() {
        for (;;) {
            counter++;
//            synchronized (ai)
            {
                shared++;

                System.out.printf("%s: counter: %d, shared: %d, shared-counter %d\n", getName(), counter, shared, shared - counter);

            }
            yield();

//            //  System.out.println(shared);
//            synchronized (ai) {
//                if (shared != ai.get()) {
//                    System.out.println(shared + ":" + ai.get());
//                    System.exit(0);
//                }
//            }
//            try {
//                sleep(10);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Race.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }

    public static void main(String[] args) {
        new Race("A").start();
        new Race("B").start();
    }

}
