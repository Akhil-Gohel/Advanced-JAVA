
package Hello;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//  Sender second
public class HelloServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2221);
        
        byte[] sd = new byte[100];
        byte[] rd = new byte[100];
        
        String msg = "Hello Client";
        sd = msg.getBytes();
        
        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket dp = new DatagramPacket(sd, sd.length, inet, 2222);
        
        ds.send(dp);
        
        DatagramPacket dp1 = new DatagramPacket(rd, rd.length);
        ds.receive(dp1);
        String ack = new String(dp1.getData());
        System.out.println(ack);
    }
}
