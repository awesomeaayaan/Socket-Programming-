
package networkprogramming.Socket.UDP;
import  java.net.*;
import java.io.*;
public class UDPServer {
    public static void main(String[] args) throws SocketException, IOException {
        byte[] buf = new byte[256];
        //create datagram socket
        DatagramSocket socket = new DatagramSocket(1440);
         //received request
         DatagramPacket packet = new DatagramPacket(buf,buf.length);
        socket.receive(packet);
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        String s = "Hello Client brother  I hope you received this message as UDP  i am not able to acknowledge from you";
        buf = s.getBytes();
        
        //Send the response to the client at "address" and "port"
        packet = new DatagramPacket(buf,buf.length,address,port);
        socket.send(packet);
        //Close Socket
        socket.close();
    }
}
