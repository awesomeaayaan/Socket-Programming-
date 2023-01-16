
package networkprogramming.ChatApplication;
import java.net.*;
import java.io.*;
import java.util.*;
public class SingleChatServer {
    public static void main(String[] args) throws IOException {
        try{
         //Register the service on the port 1433
        ServerSocket ss = new ServerSocket(1435);
        //Wait and accept the a connection
        Socket cs = ss.accept();
        
        //Get a communication stream associated with the socket
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(),true);
        Scanner ink = new Scanner(System.in);
        String rmsg,smsg;
        
        do{
            System.out.println("Server");
            smsg = ink.nextLine();
            outs.println(smsg);
            rmsg=ins.nextLine();
            System.out.println("\tClient:"+rmsg);
            
        }
        while(rmsg.equals("buy")!=true);
        outs.close();
        ins.close();
        cs.close();
        ss.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
