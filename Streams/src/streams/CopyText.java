/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author danecek
 */
public class CopyText {

    static void copyFromTo3(String from, String to)
            throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(from));
                PrintWriter pw = new PrintWriter(new FileWriter(to))) {
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                System.out.println(line);
                pw.println(line);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        copyFromTo3("manifest.mf", "manifestutf8.mf");
    }
}
