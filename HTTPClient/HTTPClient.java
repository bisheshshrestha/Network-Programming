package HTTPClient;

import java.io.*;
import javax.net.ssl.*;



public class HTTPClient {
    public static void main(String[] args) {

        int port =443; //default https port
        String host = "www.google.com";

        try{
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket socket = (SSLSocket) factory.createSocket(host,port);

            Writer out = new OutputStreamWriter(socket.getOutputStream());
            //https requires the full URL in the GET line
            out.write("GET /HTTP 1.1\r\n");
            out.write("\r\n");
            out.flush();
            
            //read response
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            int c;
            while ((c = in.read()) != -1) {
                System.out.write(c);
            }
            out.close();
            in.close();
            socket.close();
        }
        catch(IOException e){
            System.err.println(e);
        }
    }
}