
package MiniChat;

import java.net.*;
import java.util.*;
import java.io.*;

public class Friend2 {
    public static void main(String[] args) throws Exception {
      
        Socket s = new Socket("localhost",2222);
        
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
        Scanner sc = new Scanner(System.in);
        
        boolean wantSend = true;
        
        while(wantSend){
            
            System.out.println("Enter message : ");
            String msg = sc.nextLine();
            dos.writeUTF(msg);
            
            String rep = dis.readUTF();
            System.out.println(rep);
            
            System.out.println("Enter 1 for Continue Chat or 0 for exit chat : ");
            wantSend = sc.nextBoolean();
            
        }
        
        dos.close();
        dis.close();
        s.close();
    }
}
