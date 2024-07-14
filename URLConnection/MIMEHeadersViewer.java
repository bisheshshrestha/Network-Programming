import java.net.*;
import java.net.URLConnection;
import java.io.*;
import java.util.*;

public class MIMEHeadersViewer {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            try {
                URL u = new URL(args[i]);
                URLConnection uc = u.openConnection();
                System.out.println("Content-type: " + uc.getContentType());
                System.out.println("Content-encoding: "+uc.getContentEncoding());
                System.out.println("Date: "+ new Date(uc.getDate()));
                System.out.println("Last modified: " +new Date(uc.getLastModified()));
                System.out.println("Expiratiom date: "+ new Date(uc.getExpiration()));
                System.out.println("Content-length: "+ uc.getContentLength());
            } catch (MalformedURLException e) {
                System.err.println(e);
            } catch (IOException e){
                System.err.println(e);
            }
            System.out.println();
        }
    }
}
