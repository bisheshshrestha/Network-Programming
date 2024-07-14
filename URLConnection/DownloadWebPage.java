/**
 * The `DownloadWebPage` class in Java downloads a web page from a specified URL and saves it to a
 * file.
 */

//The URLConnection and HttpURLConnection classes for developing Java network applications
import java.io.*;
import java.net.*;

public class DownloadWebPage {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Syntax: <url> <file>");
            return;
        }

        String url = args[0];
        String filePath = args[1];

        try {
            URL urlObj = new URL(url);
            java.net.URLConnection urlCon = urlObj.openConnection();
            InputStream inputStream = urlCon.getInputStream();
            BufferedInputStream reader = new BufferedInputStream(inputStream);

            BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(filePath));

            byte[] buffer = new byte[4096];
            int bytesRead = -1;

            while ((bytesRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, bytesRead);
            }

            writer.close();
            reader.close();

            System.out.println("Web page saved");

        } catch (MalformedURLException e) {
            System.out.println("The specified URL is malformed: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An I/O error occurs: " + e.getMessage());
        }

    }
}