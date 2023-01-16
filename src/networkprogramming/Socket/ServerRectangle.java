
package networkprogramming.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerRectangle {
     public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(2444);
        System.out.println("Waiting for Client Request: ");
        Socket s = ss.accept();
        String str1,str2;
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        str1 = br.readLine();
        str2=br.readLine();
        System.out.println("Receive length");
         System.out.println("Receive breadth");
        double l = Double.valueOf(str1);
         double b = Double.valueOf(str2);
        double area = l*b;
        PrintStream ps = new PrintStream(s.getOutputStream());
        ps.println(String.valueOf(area));
        br.close();
        ps.close();
        s.close();
        ss.close();
    }
}
