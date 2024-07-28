
package RandomNumberGenerator;

import java.io.*;
import java.net.*;
import java.util.Random;

public class RandomServer {
    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(2222);
        Socket s = ss.accept();
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
        Random r = new Random();
        int rno = r.nextInt();
        
        dos.writeInt(rno);
        dos.close();
        os.close();
        s.close();
        ss.close();
    }
}
