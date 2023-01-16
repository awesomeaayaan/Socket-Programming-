
package networkprogramming.ChatApplication;

import java.io.IOException;
import java.net.Socket;

public class ClientChat {
    public static void main(String[] args) throws IOException {
        try{
        System.out.println("Client Started");
        Socket soc = new Socket("localhost",1433);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
