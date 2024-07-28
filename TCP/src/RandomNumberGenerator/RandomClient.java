
package RandomNumberGenerator;

import java.net.*;
import java.io.*;

public class RandomClient {
    public static void main(String[] args) throws Exception {
        
        Socket s = new Socket("localhost",2222);
        
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        
        System.out.println("Random no is = "+dis.readInt());
        
        dis.close();
        is.close();
        s.close();
    }
}
