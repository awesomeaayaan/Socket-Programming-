
package networkprogramming.AreaofCircle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import javax.swing.JOptionPane;
public class Client {
   
     public static void main(String[] args) throws Exception{

     Client  clientSocket = new Client();
     clientSocket.run();

    }
     
    public void run()throws Exception {
      Socket SOCK = new Socket("localhost", 1445);
        PrintStream PS = new PrintStream(SOCK.getOutputStream());
          double p =3.14;

                String radiusInput = JOptionPane.showInputDialog("Enter Radius");
                double r = Double.parseDouble(radiusInput);


             double area = (22*r*r)/7;
 JOptionPane.showMessageDialog(null, area);

        PS.println("Calculating...");

        InputStreamReader IR = new InputStreamReader(SOCK.getInputStream());
        BufferedReader BR = new BufferedReader(IR); 
        String message = BR.readLine();
        System.out.println(message);

    }
}
