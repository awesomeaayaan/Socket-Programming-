
package networkprogramming.ChatApplication;
import java.net.*;
import java.io.*;
import java.util.*;
public class SingleChatClient {
    public static void main(String[] args) throws IOException {
         Socket cs = new Socket("localhost",1435);
         
           Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream());
        Scanner ink = new Scanner(System.in);
        String rmsg,smsg;
        do{
            rmsg=ins.nextLine();
            System.out.println("\tServer:"+rmsg);
            System.out.println("Client:");
            smsg = ink.nextLine();
            outs.println(smsg);
            
        }while(rmsg.equals("buy")!=true);
        ins.close();
        outs.close();
        cs.close();
    }
}
