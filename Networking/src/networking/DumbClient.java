package networking;

import java.io.*;
import java.net.*;

public class DumbClient {

    static String askServer(String question, InetAddress serverAddress, int port) throws SocketException, IOException
             {
        try (DatagramSocket socket = new DatagramSocket()) {
            byte[] q = question.getBytes();
            DatagramPacket packet = new DatagramPacket(q, q.length, serverAddress, port);
            socket.send(packet);
            packet.setData(new byte[256]);
            socket.receive(packet);
            return new String(packet.getData(), 0, packet.getLength());
        }
    }

    public static void main(String[] args) throws IOException, SocketException, UnknownHostException, InterruptedException {
        new DumbServer(4445).start();
        System.out.println(askServer("????", InetAddress.getLocalHost(), 4445));
        System.out.println(askServer("!!!", InetAddress.getLocalHost(), 4445));
    }
}
