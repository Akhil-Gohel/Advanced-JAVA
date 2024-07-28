package java_networks;

import java.net.URL;
import java.util.Date;
import java.net.URLConnection;

public class URLConnectionDemo {

    public static void main(String args[]) throws Exception {
        URL url = new URL("https://www.youtube.com/watch?v=_TTvmxevaJU&list=PLO14KY9mobCKPnTi2sVQa5zBUk1FIq1Jj&index=3");
        URLConnection urlcon = url.openConnection();
        System.out.println(urlcon.getContent());
        System.out.println(urlcon.getExpiration());
        System.out.println(new Date(urlcon.getExpiration()));
        System.out.println(urlcon.getContentType());
        System.out.println(urlcon.getContentLength());
    }
}