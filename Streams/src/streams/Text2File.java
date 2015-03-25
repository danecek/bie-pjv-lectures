/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author danecek
 */
public class Text2File {

    void text2File(String text, String file) throws IOException {
        try (FileWriter fos = new FileWriter(file)) {
            fos.write(text);
        }
    }

    public static void main(String[] args) {

    }
}
