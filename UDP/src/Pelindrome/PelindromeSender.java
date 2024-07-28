
package Pelindrome;

import java.net.*;
import java.util.Scanner;

public class PelindromeSender {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2222);
        
        byte[] sd = new byte[100];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        int len = str.length();
        sd = str.getBytes();
        
        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket dp = new DatagramPacket(sd, sd.length, inet, 2221);
        
        ds.send(dp);
    }
}
