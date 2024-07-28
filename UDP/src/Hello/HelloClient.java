
package Hello;

import java.net.*;

//  Receiver first
public class HelloClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2222);
        
        byte[] rd = new byte[100];
        byte[] sd = new byte[100];
        
        DatagramPacket dp = new DatagramPacket(rd,rd.length);
        ds.receive(dp);
        String msg = new String(dp.getData());
        System.out.println(msg);
        
        String ack = "Hello Server";
        sd = ack.getBytes();
        
        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket dp1 = new DatagramPacket(sd, sd.length, inet, 2221);
        ds.send(dp1);
    }
}
