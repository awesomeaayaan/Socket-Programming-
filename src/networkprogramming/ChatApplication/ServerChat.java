
package networkprogramming.ChatApplication;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
    public static void main(String[] args) {
        try{
            System.out.println("Wating for Client: ");
            ServerSocket ss = new ServerSocket(1433);
            Socket soc = ss.accept();
            System.out.println("Connection established");
            
        }catch (Exception e){
            
        }
    }
}
