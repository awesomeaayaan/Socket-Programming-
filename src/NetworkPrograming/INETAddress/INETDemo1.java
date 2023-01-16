
package NetworkPrograming.INETAddress;
import java.net.*;
public class INETDemo1 {
    public static void main(String[] args)
	        throws UnknownHostException
	    {
	        // To get and print InetAddress of Local Host
	        InetAddress address1 = InetAddress.getLocalHost();
	        System.out.println("InetAddress of Local Host : "
	                           + address1);
	 
	        // To get and print InetAddress of Named Host
	        InetAddress address2
	            = InetAddress.getByName("45.22.30.39");
	        System.out.println("InetAddress of Named Host : "
	                           + address2);
	 
	        // To get and print ALL InetAddresses of Named Host
	        InetAddress address3[]
	            = InetAddress.getAllByName("172.19.25.29");
	        for (int i = 0; i < address3.length; i++) {
	            System.out.println(
	                "ALL InetAddresses of Named Host : "
	                + address3[i]);
	        }
	    }
}
