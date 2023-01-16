
package networkprogramming.Socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
public class Client {
    public static void main(String[] args)  throws IOException{
        Socket  s =  new Socket("localhost",1434);
         DataInputStream dis = new DataInputStream(s.getInputStream());
        //Data input stream is used to reading the primitive data type and function
        // getInputStream for obtaining the appended data to teh socket
         DataOutputStream dos = new DataOutputStream(s.getOutputStream());
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader stdin = new BufferedReader(isr);
         String s1 = "",s2="";
         //the code is written in such a way that the clien will be firt to ping then client will wait for server to respond
         //it is just like synchorous communication
         while(!s1.equals("stop")){
             s2 = stdin.readLine();
             dos.writeUTF(s2);
             dos.flush ();
             s1 = dis.readUTF();
             System.out.println("Server: "+s1);
         }
         dos.close();
         s.close();
    }
}
