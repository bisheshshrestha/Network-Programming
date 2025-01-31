import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
public class URLConnection {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        try{
            URL url = new URL("https://portal.nepalcanmove.com/");
            HttpURLConnection connection =(HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent","Chrome");
            connection.setReadTimeout(30000);

            int responseCode = connection.getResponseCode();
            System.out.println("Response code: " + responseCode);

            if(responseCode != 200){
                System.out.println("Error reading web page");
                System.out.println(connection.getResponseMessage());
                return;
            }

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;

            while((line = inputReader.readLine()) != null){
                System.out.println(line);
            }

            inputReader.close();
        }catch(MalformedURLException e){
            System.out.println("Malformed URL: "+e.getMessage());
        }catch(IOException e){
            System.out.println("IOException: "+e.getMessage());
        }
    }
    
}
