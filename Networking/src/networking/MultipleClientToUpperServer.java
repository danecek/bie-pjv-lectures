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

public class MultipleClientToUpperServer extends Thread {

    private final ServerSocket ss;

    public MultipleClientToUpperServer(int port) throws IOException {
        ss = new ServerSocket(port);
    }

    class ClientTask extends Thread {

        private final Socket s;

        public ClientTask(Socket s) {
            this.s = s;
        }

        @Override
        public void run() {
            try (Socket s = this.s;
                    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    PrintWriter pw = new PrintWriter(s.getOutputStream());) {
                for (;;) {
                    String line = br.readLine();
                    System.out.println("server received: " + line);
                    pw.println(line.toUpperCase());
                    pw.flush();
                }
            } catch (IOException ex) {
                Logger.getLogger(MultipleClientToUpperServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public void run() {
        for (;;) {
            try {
                Socket s = ss.accept();
                new ClientTask(s).start();
            } catch (IOException ex) {
                Logger.getLogger(MultipleClientToUpperServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
