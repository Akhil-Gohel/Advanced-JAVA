
package HelloClient;

import java.net.*;
import java.io.*;

public class HelloServer {
    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(2222);
        Socket s = ss.accept();
        
        OutputStream os = s.getOutputStream();
        PrintWriter pw = new PrintWriter(os, true);
        
        String msg = "Hello Client!";
        pw.println(msg);
        
        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        
        System.out.println(br.readLine());
        
        pw.close();
        os.close();
        s.close();
        ss.close();
    }
}
