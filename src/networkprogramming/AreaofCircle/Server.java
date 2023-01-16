
package networkprogramming.AreaofCircle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
    public static void main(String[] args) throws Exception{

        Server aServer = new Server();
        aServer.run();
    }

    public void run() throws Exception{

        ServerSocket servSocket = new ServerSocket(1445);
        Socket socket = servSocket.accept();

        InputStreamReader IR = new InputStreamReader(socket.getInputStream());
        BufferedReader BR = new BufferedReader(IR);
        String message =  BR.readLine();
        System.out.println(message);

        if(message!=null)
        {
            PrintStream PS  = new PrintStream(socket.getOutputStream());
            Client c = new Client();
            c.run();
            PS.println("Message received");
        }

    }
    
}
