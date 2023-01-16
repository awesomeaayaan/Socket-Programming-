
package networkprogramming.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
public class ClientRectangle {
     public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",2444);
        String str1,str2;
        System.out.println("Enter Length :");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str1 = br.readLine();
         System.out.println("Enter the breadth");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        str2 = br1.readLine();
        PrintStream ps = new PrintStream(s.getOutputStream());
        ps.println(str1);
        PrintStream ps2 = new PrintStream(s.getOutputStream());
        ps2.println(str2);
        BufferedReader fs = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String result = fs.readLine();
        System.out.println("Area of the rectangle is "+result);
        br.close();
        fs.close();
        ps.close();
        s.close();
    }
}
