// package MultipleConnectionServer;

// import java.io.IOException;
// import java.io.OutputStreamWriter;
// import java.io.Writer;
// import java.net.ServerSocket;
// import java.net.Socket;
// import java.util.Date;

// public class MultipleConnectionServer {
//     public static void main(String[] args) throws IOException {
//         int port = 6666;
//         ServerSocket server = new ServerSocket(port);
//         while (true) {
//             try(Socket connection =server.accept()){
//                 Writer out = new OutputStreamWriter(connection.getOutputStream());
//                 Date now = new Date();
//                 out.write(now.toString()+ "\r\n");
//                 out.flush();
//             }catch(IOException ex){
//                 //problem with one client; don't shut down the server
//                 System.err.println(ex);
//             }
//         }
//     }
// }
