/**
 * The `URLCharacteristics` class in Java displays various characteristics of a given URL such as
 * protocol, host, port, path, reference, file, authority, query, and user info.
 */
import java.net.*;

public class URLCharacteristics {

    private static void displayURL(URL url) {
        System.out.println("URL: " + url);
        System.out.printf("Protocol: %-32s Host: %-32s\n", url.getProtocol(), url.getHost());
        System.out.printf("Port: %-32d Path: %-32s\n", url.getPort(), url.getPath());
        System.out.printf("Reference: %-32s File: %-32s\n", url.getRef(), url.getFile());
        System.out.printf("Authority: %-32s Query: %-32s\n", url.getAuthority(), url.getQuery());
        System.out.println("User Info: " + url.getUserInfo());
    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        try {
            // Replace with your desired URL
            URL url = new URL("https://mindrisers.com.np/courses/data-science-with-python-training-in-nepal#syllabus");
            // System.out.println("getContent"+url.getContent());
            displayURL(url);
        } catch (MalformedURLException ex) {
            System.out.println(ex);
        }
    }
}
