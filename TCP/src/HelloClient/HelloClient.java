
package HelloClient;

import java.net.*;
import java.io.*;

public class HelloClient {
    public static void main(String[] args) throws Exception {
        
        Socket s = new Socket("localhost",2222);
        
        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        
        System.out.println(br.readLine());
        
        OutputStream os = s.getOutputStream();
        PrintWriter pw = new PrintWriter(os,true);
        
        String msg = "Hello Server";
        pw.println(msg);
        
        br.close();
        is.close();
        s.close();
    }
}
