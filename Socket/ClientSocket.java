/**
 * This Java class represents a client socket that connects to a server socket on localhost and sends a
 * message "Hello Socket!".
 */
package Socket;

import java.io.DataOutputStream;
import java.net.Socket;

public class ClientSocket {
    public static void main(String[] args) {
        try {
            // initializing Socket
            Socket soc = new Socket("localhost", 6666);
            DataOutputStream d = new DataOutputStream(soc.getOutputStream());

            // message to display
            d.writeUTF("Hello Socket!");
            d.flush();

            // closing DataOutpurStream
            d.close();

            // closing socket
            soc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
