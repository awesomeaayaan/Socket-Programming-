
package networkprogramming.BMC.edu.NetworkPrograming.URLDemo;
import java.io.*;
import java.net.*;

public class URLDemo {
    public static void main(String[] args) {
        
        try{
            URL url = new URL("https://github.com/KirandeepMarala/nlp-tutorials/blob/main/10_stop_words/stop_words_exercise.ipynb");
            System.out.println("Protocol:"+url.getProtocol());
            System.out.println("Host Name:"+url.getHost());
            System.out.println("Port Number:"+url.getPort());
            System.out.println("Port Number:"+url.getPort());
            System.out.println("File Name:"+url.getFile());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
