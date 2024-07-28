package java_networks;

import java.net.URL;

public class URLDemo {

    public static void main(String args[]) throws Exception {
        URL url = new URL("https://www.youtube.com/watch?v=_TTvmxevaJU&list=PLO14KY9mobCKPnTi2sVQa5zBUk1FIq1Jj&index=3");
        System.out.println(url.getClass());
        System.out.println(url.getHost());
        System.out.println(url.getPath());
        System.out.println(url.getPort());
        System.out.println(url.getDefaultPort());
        System.out.println(url.getProtocol());
        System.out.println(url.getFile());
        System.out.println(url.getContent());
        System.out.println("");
        
        String protocol = "https";
        String host = "youtube1.com";
        int port = 2244;
        String file = "LJIT,CE";
        URL url1 = new URL(protocol, host, port, file);
        System.out.println(url1.getClass());
        System.out.println(url1.getHost());
        System.out.println(url1.getPath());
        System.out.println(url1.getPort());
        System.out.println(url1.getDefaultPort());
        System.out.println(url1.getProtocol());
        System.out.println(url1.getFile());
    }
}
