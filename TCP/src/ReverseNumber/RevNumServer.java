
package ReverseNumber;

import java.net.*;
import java.io.*;
        
public class RevNumServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2222);
        Socket s = ss.accept();
        
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
        int num = dis.readInt();
        int rev = 0;
        while(num!=0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        
        dos.writeInt(rev);
        dos.close();
        os.close();
        dis.close();
        is.close();
        s.close();
        ss.close();
    }
}
