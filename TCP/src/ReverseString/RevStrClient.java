
package ReverseString;

import java.net.*;
import java.util.*;
import java.io.*;

public class RevStrClient {
    public static void main(String[] args) throws Exception {
      
        Socket s = new Socket("localhost",2222);
        
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
        Scanner sc = new Scanner(System.in);
        
        String  str = sc.nextLine();
        dos.writeUTF(str);
        
        String rev = dis.readUTF();
        System.out.println(rev);
        
        dos.close();
        dis.close();
        s.close();
    }
}
