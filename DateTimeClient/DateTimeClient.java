// import java.io.IOException;
// import java.net.Socket;
// import java.util.Scanner;

// public class DateTimeClient {
//     public static void main(String[] args) throws IOException {
//         if (args.length != 1) {
//             System.err.println("Pass the server IP as a single command line argument");
//             return;
//         }
//         Socket socket = new Socket(args[0], 59090);
//         Scanner in = new Scanner(socket.getInputStream());
//         System.out.println("Server response: " + in.nextLine());
//     }
// }
