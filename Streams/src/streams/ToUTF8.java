/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author danecek
 */
public class ToUTF8 {

    static void toUTF8(String from, String to) throws IOException {
        FileReader fr = new FileReader(from);
        try (Writer w = new OutputStreamWriter(new FileOutputStream(to), StandardCharsets.UTF_8)) {
            for (int cr = fr.read(); cr != -1; cr = fr.read()) {
                w.write(cr);
                System.out.println((char)cr);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        toUTF8("manifest.mf", "manifestutf8.mf");
        
    }

}
