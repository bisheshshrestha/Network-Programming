/**
 * The `MasterSocket` class in Java creates a server socket, accepts a connection, reads a message from
 * the client, and then closes the socket.
 */

package Socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MasterSocket {
    public static void main(String[] args) {
        int port_no = 6666;
        // port number of a server application running on server
        try {
            ServerSocket ss = new ServerSocket(port_no);

            // etablishes connection
            Socket soc = ss.accept();

            // invoking input stream
            DataInputStream dis = new DataInputStream(soc.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message = " + str);

            // closing socket
            ss.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}