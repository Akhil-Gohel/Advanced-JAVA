
package Pelindrome;

import java.io.*;
import java.net.*;

public class PelindromeServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2222);
        Socket s = ss.accept();
        
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
        String  str = dis.readUTF();
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        
        if(str.equals(rev)){
            dos.writeUTF("Pelindrome");
        }
        else{
            dos.writeUTF("Not Pelindrome");
        }
        
        dos.close();
        dis.close();
        s.close();
        ss.close();
    }
}
