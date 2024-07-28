
package Calculator;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class CalcClient {
    public static void main(String[] args) throws Exception {
        
        Socket s = new Socket("localhost",2222);
        
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the operation : ");
        char o = sc.next().charAt(0);
        dos.writeChar(o);
        
        System.out.println("Enter the first no : ");
        dos.writeInt(sc.nextInt());
        
        System.out.println("Enter the second no : ");
        dos.writeInt(sc.nextInt());
        
        System.out.println("Your ans is = "+dis.readInt());
              
        dis.close();
        is.close();
        dos.close();
        os.close();
        s.close();
    }
}
