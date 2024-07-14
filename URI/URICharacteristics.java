/**
 * The `URICharacteristics` class in Java demonstrates how to extract and display various components of
 * a URI such as authority, scheme, host, path, query, fragment, and user info.
 */
import java.net.*;
public class URICharacteristics {

    private static void displayURI(URI uri){
        System.out.println("getAuthority:" + uri.getAuthority());
        System.out.println("getScheme:" + uri.getScheme());
        System.out.println("getSchemeSepcificPart:" + uri.getSchemeSpecificPart());
        System.out.println("getHost:" + uri.getHost());
        System.out.println("getPath:" + uri.getPath());
        System.out.println("getQuery:" + uri.getQuery());
        System.out.println("getFragment:" + uri.getFragment());
        System.out.println("getUserInfo:" + uri.getUserInfo());
        System.out.println("normalize:" + uri.normalize());
    }

    public static void main(String[] args) {
        try{
            URI uri= new URI("https://github.com/bisheshshrestha/github_test#helloworld");
            displayURI(uri);
        }catch(URISyntaxException ex){
            System.out.println(ex);
        }
    }
}
