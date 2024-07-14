import java.net.*;
import java.io.*;

public class SourceViewer {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            try { 
                URL u = new URL(args[i]);
                HttpURLConnection uc = (HttpURLConnection) u.openConnection();
                int code = uc.getResponseCode();
                String response = uc.getResponseMessage();
                System.out.println("HTTP/1.x " + code + " " + response);

                for (int j = 1; ; j++) {
                    String header = uc.getHeaderField(j);
                    String key = uc.getHeaderFieldKey(j);
                    if (header == null || key == null) {
                        break;
                    }
                    System.out.println(key + ": " + header);
                }
                
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(uc.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    System.err.println("Error reading content: " + e.getMessage());
                }
                
            } catch (MalformedURLException ex) {
                System.err.println(args[i] + " is not a parseable URL");
            } catch (IOException ex) {
                System.err.println("IOException for " + args[i] + ": " + ex.getMessage());
            }
        }
    }
}
