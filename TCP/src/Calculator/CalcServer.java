
package Calculator;

import java.net.*;
import java.io.*;

public class CalcServer {
    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(2222);
        Socket s = ss.accept();
        
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
        switch (dis.readChar()) {
            case '+':{
                dos.writeInt(dis.readInt() + dis.readInt());
                break;
            }
            case '-':{
                dos.writeInt(dis.readInt() - dis.readInt());
                break;
            }
            case '*':{
                dos.writeInt(dis.readInt() * dis.readInt());
                break;
            }
            case '/':{
                dos.writeInt(dis.readInt() / dis.readInt());
                break;
            }
            default:
                break;
        }
        
        dis.close();
        is.close();
        dos.close();
        os.close();
        s.close();
        ss.close();
    }
}
