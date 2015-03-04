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
public class Producer extends Thread {

    private Buffer buff;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                buff.setData(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public Producer(Buffer buff) {
        this.buff = buff;
    }
}
