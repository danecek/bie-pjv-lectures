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
public class Buffer {

    private int data;
    private boolean valid = false;

    synchronized void setData(int data) throws InterruptedException {
        while (valid) {
            wait();
        }
        this.data = data;
        valid = true;
        notify();
    }

    synchronized int getData() throws InterruptedException {
        while (!valid) {
            wait();
        }
        notify();
        valid =false;
        return data;
    }

    public static void main(String[] args) {
        Buffer buff = new Buffer();
        new Producer(buff).start();
        new Consumer(buff).start();
    }

}
