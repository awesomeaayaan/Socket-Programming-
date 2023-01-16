//Client Program
package networkprogramming;
import java.net.*;
import java.io.*;
import java.util.*;

public class NetworkProgramming {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Open your connection to a serrver, at port 1433
        Socket cs = new Socket("localhost",1433);
        
        //get the input file handle from teh socket and read the input
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream());
        
        //Perform IO
        outs.println("Hellow Server");
        String s = ins.nextLine();
        System.out.println("From Server: "+s);
        //close streams and connection
        ins.close();
        outs.close();
        cs.close();
    }
    
}
