
package ReverseString;

import java.net.*;
import java.util.*;
import java.io.*;

public class RevStrServer {
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
        
        dos.writeUTF(rev);
        
        dos.close();
        dis.close();
        s.close();
        ss.close();
    }
}
