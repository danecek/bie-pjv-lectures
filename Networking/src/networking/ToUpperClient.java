/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author danecek
 */
public class ToUpperClient {

    static int port = 3333;
    static String host = "localhost";

    public static void main(String[] args) throws IOException {
        new ToUpperServer(port).start();
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket(host, port);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                PrintWriter pw = new PrintWriter(s.getOutputStream())) {

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                pw.println(line);
                pw.flush();
                System.out.println("client received: " + br.readLine());
            }
        }
    }
}
