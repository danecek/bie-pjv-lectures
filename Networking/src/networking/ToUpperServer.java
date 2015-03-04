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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ToUpperServer extends Thread {

    private final ServerSocket ss;

    public ToUpperServer(int port) throws IOException {
        ss = new ServerSocket(port);
    }

    @Override
    public void run() {
        try (Socket s = ss.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                PrintWriter pw = new PrintWriter(s.getOutputStream())) {
            for (;;) {
                String line = br.readLine();
                System.out.println("server received: " + line);
                pw.println(line.toUpperCase());
                pw.flush();
            }
        } catch (IOException ex) {
            Logger.getLogger(ToUpperServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
