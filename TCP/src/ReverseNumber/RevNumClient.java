
package ReverseNumber;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class RevNumClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",2222);
        
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        dos.writeInt(num);
        
        System.out.println("Reverse number is : "+dis.readInt());
        
        dos.close();
        os.close();
        dis.close();
        is.close();
        s.close();
    }
}
