
package networkprogramming;
import java.net.*;
import java.io.*;
import java.util.*;
public class ServerMsg {
    public static void main(String[] args) throws IOException {
        //Register the service on the port 1433
        ServerSocket ss = new ServerSocket(1433);
        //Wait and accept the a connection
        Socket cs = ss.accept();
        
        //Get a communication stream associated with the socket
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(),true);
        
        //Performs
        String s = ins.nextLine();
        System.out.println("From Client: "+s);
        outs.println("Hello Client");
        
        //Close strean and connection
        outs.close();
        ins.close();
        cs.close();
        ss.close();
        
    }
    
}
