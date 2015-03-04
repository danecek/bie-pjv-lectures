/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danecek
 */
public class Consumer extends Thread {

    private Buffer buff;

    @Override
    public void run() {
        for (;;) {
            try {
                System.out.println(buff.getData());
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public Consumer(Buffer buff) {
        this.buff = buff;
    }
}
