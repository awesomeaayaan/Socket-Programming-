
package NetworkPrograming.INETAddress;
import java.net.*;
public class InetDemo {
    public static void main(String[] args) throws Exception {
        InetAddress ip;
        ip = InetAddress.getByName("www.aayaangautam.com.np");
        System.out.println("Host Name: "+ip.getHostName());
        System.out.println("IP Address: "+ip.getHostAddress());
        
    }
}
