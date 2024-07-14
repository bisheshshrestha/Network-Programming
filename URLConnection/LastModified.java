//Get the time when a URL was last changed

/**
 * The `LastModified` class in Java retrieves and displays the last modified date of a given URL using
 * HTTP HEAD requests.
 */
import java.net.*;
import java.io.*;
import java.util.*;
public class LastModified {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        for(int i = 0; i < args.length;i++){
            try{
                URL u = new URL(args[i]);
                HttpURLConnection http = (HttpURLConnection)u.openConnection();
                http.setRequestMethod("HEAD");
                System.out.println(u + "was last modified at " + new Date(http.getLastModified()));
            }catch(MalformedURLException ex){
                System.err.println(args[i] + "is no a URL i understand");
            }catch(IOException ex){
                System.err.println(ex);
            }
        }
    }
}

// PS D:\BCA\Network Programming\URLConnection> javac LastModified.java
// PS D:\BCA\Network Programming\URLConnection> java LastModified http://www.ibiblio.orf/xml http:// www.iis.org/                                      
// http://www.ibiblio.orf/xmlwas last modified at Thu Jan 01 05:30:00 NPT 1970                                                                         
// http:was last modified at Thu Jan 01 05:30:00 NPT 1970
// www.iis.org/is no a URL i understand
// PS D:\BCA\Network Programming\URLConnection>