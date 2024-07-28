
package Pelindrome;

import java.net.*;
import java.util.Scanner;

public class PelindromeReceiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2221);
        
        byte[] rd = new byte[100];

        DatagramPacket dp = new DatagramPacket(rd,rd.length);
        ds.receive(dp);
        
        String str = new String(dp.getData());
        System.out.println(str);
        
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter size of String : ");
        int j = sc.nextInt() - 1;
        boolean isPelindrome = true;
       
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println(j);
                isPelindrome = false;
                break;
            }
            else{
                i++;
                j--;
            }
        }
        if(isPelindrome){
            System.out.println("It is Pelindrome");
        }
        else{
            System.out.println("It's not Pelindrome");
        }
    }
}
