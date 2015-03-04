package networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DumbServer extends Thread {

    public DumbServer(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }

    byte[] buf = new byte[256];
    DatagramPacket packet = new DatagramPacket(buf, buf.length);
    DatagramSocket socket;

    @Override
    public void run() {
        try {
            for (;;) {
                socket.receive(packet);
                String question = new String(packet.getData(), 0, packet.getLength());
                byte[] answer = (question + " I dont' know!").getBytes();
                packet.setData(answer);
                socket.send(packet);
                packet.setData(buf);
            }
        } catch (IOException ex) {
            Logger.getLogger(DumbServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
