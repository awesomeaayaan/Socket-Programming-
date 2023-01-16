
package networkprogramming.Socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1434);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        //Data input stream is used to reading the primitive data type and function
        // getInputStream for obtaining the appended data to teh socket
         DataOutputStream dos = new DataOutputStream(s.getOutputStream());
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader stdin = new BufferedReader(isr);
         String s1 = "",s2="";
         while(!s1.equals("stop"))
         {
             s1 = dis.readUTF();
             System.out.println("Client :"+s1);
             s2=stdin.readLine();
             dos.writeUTF(s2);
             dos.flush();
         }
         dis.close();
         s.close();
         ss.close();
         
        
    }
}
