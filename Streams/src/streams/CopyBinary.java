/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author danecek
 */
public class CopyBinary {

    void copyFromTo(String from, String to)
            throws IOException {
        try (InputStream is = new FileInputStream(from);
                OutputStream os = new FileOutputStream(to)) {
            for (int i = is.read(); i != -1; i = is.read()) {
                os.write(i);
            }
        }
    }

    void copyFromTo2(String from, String to)
            throws IOException {
        InputStream is = new FileInputStream(from);
        OutputStream os = new FileOutputStream(to);
        for (int i = is.read(); i != -1; i = is.read()) {
            os.write(i);
        }
        is.close();
        os.close();
    }

    void copyFromTo3(String from, String to)
            throws IOException {
        try (InputStream is = new BufferedInputStream(new FileInputStream(from));
             OutputStream os = new BufferedOutputStream(new FileOutputStream(to))) {
            for (int i = is.read(); i != -1; i = is.read()) {
                os.write(i);
            }
        }
    }
}
