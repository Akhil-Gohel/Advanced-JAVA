package java_networks;

import java.net.InetAddress;

public class InetAddressDemo{
    public static void main(String[] args) throws Exception {
        InetAddress inet = InetAddress.getByName("localhost");
        System.out.println(inet);
        InetAddress inet1= InetAddress.getByName("LAPTOP-RUF2DHUJ");
        System.out.println(inet1);
        InetAddress inet2 = InetAddress.getByName("www.google.com");
        System.out.println(inet2);
        InetAddress inet3[] = InetAddress.getAllByName("LAPTOP-RUF2DHUJ");
        for(InetAddress i : inet3)
        {
            System.out.println(i);
        }
        System.out.println(InetAddress.getLocalHost());
        System.out.println(inet.getHostAddress());
        System.out.println(inet1.equals(inet2));
        System.out.println(inet2.isMulticastAddress());
        System.out.println(inet1.isMulticastAddress());
    }
}