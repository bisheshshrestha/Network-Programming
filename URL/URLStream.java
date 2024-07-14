/**
 * This Java class reads and prints the content of a webpage specified by a URI using URL and
 * InputStream.
 */
    import java.io.InputStream;
    import java.net.*;

    public class URLStream {
        public static void main(String[] args) throws Exception {

            URI uri = new URI("https://www.baidu.com");
            URL url =uri.toURL();
            try (InputStream InputStream = url.openStream()) {
                int c;
                while ((c = InputStream.read()) != -1) {
                    System.out.print((char) c);
                }
            }
        }
    }
