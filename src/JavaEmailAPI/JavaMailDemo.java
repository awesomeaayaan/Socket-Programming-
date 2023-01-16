
package JavaEmailAPI;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMailDemo {
    public static void  sendMail(String recepient) throws Exception{
        System.out.println("Preparing to ssend email ");
        
      //Create email sending properties
     Properties props = new Properties();
     props.put("mail.smtp.auth", "true");
     props.put("mail.smtp.starttls.enable", "true");
     props.put("mail.smtp.host", "smtp.gmail.com");
     props.put("mail.smtp.port", "587");
     
    final String USER_NAME = "aayaan.gautam1999@gmail.com";   //User name of the Goole(gmail) account
    final String PASSSWORD = "**********";  //Password of the Goole(gmail) account
    //final String FROM_ADDRESS = "aayaan.gautam1999@gmail.com";  //From addresss
    
    Session session = Session.getInstance(props,
    new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication("aayaan.gautam1999@gmail.com", "**********");
   }
    });
    Message message = prepareMessage(session,USER_NAME,recepient);
    
    
    Transport.send(message); //Send email message
     System.out.println("sent email successfully!");
    }
    private static Message prepareMessage(Session session,String USER_NAME,String recepient){
         try {
       
             Message message = new MimeMessage(session);
       
            message.setFrom(new InternetAddress("USER_NAME")); //Set from address of the email
             message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("aayaan.gautam1999@gmail.com")); //Set email recipient
             message.setSubject("Hello World"); //Set email message subject

   //System.out.println("sent email successfully!");
        } catch (Exception ex) {
            Logger.getLogger(JavaMailDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
}
