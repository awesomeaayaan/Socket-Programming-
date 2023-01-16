
package networkprogramming.Socket;
import java.io.*;
import java.net.*;
public class Servermsg {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1444);
        System.out.println("Waiting for Client Request: ");
        Socket s = ss.accept();
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        str = br.readLine();
        System.out.println("Receive radius");
        double r = Double.valueOf(str);
        double area = 3.14*r*r;
        PrintStream ps = new PrintStream(s.getOutputStream());
        ps.println(String.valueOf(area));
        br.close();
        ps.close();
        s.close();
        ss.close();
    }
    
}
