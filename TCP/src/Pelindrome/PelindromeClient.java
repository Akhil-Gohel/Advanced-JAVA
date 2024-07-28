
package Pelindrome;

import java.net.*;
import java.util.*;
import java.io.*;

public class PelindromeClient {
    public static void main(String[] args) throws Exception {
      
        Socket s = new Socket("localhost",2222);
        
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
        Scanner sc = new Scanner(System.in);
        
        String  str = sc.nextLine();
        dos.writeUTF(str);

        System.out.println(dis.readUTF());
        
        dos.close();
        dis.close();
        s.close();
    }
}
