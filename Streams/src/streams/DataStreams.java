/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author danecek
 */
public class DataStreams {

    static double dataAvarage(String data) throws IOException {
        DataInputStream dos = new DataInputStream(new FileInputStream("data.bin"));
        double sum = 0;
        int count = 0;
        try {
            for (;;) {
                sum += dos.readDouble();
                count++;
            }
        } catch (EOFException ex) {
            return sum / count;
        }
    }

    public static void main(String[] args) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
            for (int i = 0; i < 1000000; i++) {
                dos.writeDouble(Math.random());
            }
        }
        System.out.println(dataAvarage("data.bin"));

    }

}
