
package networkprogramming.Socket.UDP;
import java.net.*;
import java.io.*;
public class UDPClient {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        //Create a socket
        DatagramSocket socket = new DatagramSocket();
        //Send a Request
        byte[] buf = new byte[256];
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(buf,buf.length,address,1440);
        socket.send(packet);
        //get response
        packet = new DatagramPacket(buf,buf.length);
        socket.receive(packet);
        //Display response
        String received = new String(packet.getData());
        System.out.println("Quote of the moment: "+received);
        //Close the socket
        socket.close();
    }
}
