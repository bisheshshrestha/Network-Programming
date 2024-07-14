import java.net.InetAddress;
import java.net.UnknownHostException;

class address {
    public static void main(String[] args) {
        // try {
        // InetAddress address = InetAddress.getByName("www.orielly.com");
        // System.out.println(address);
        // } catch (UnknownHostException ex) {
        // System.out.println("Could not find address");
        // }

        // Reverse Lookup
        // try {
        // InetAddress address = InetAddress.getByName("23.209.103.32");
        // System.out.println(address.getHostName());
        // } catch (UnknownHostException ex) {
        // System.out.println("Could not find address");
        // }

        // getAllByName
       /* try {
        InetAddress[] addresses = InetAddress.getAllByName("www.youtube.com");
        for(InetAddress address : addresses){
        System.out.println(address);
        }
        } catch (UnknownHostException ex) {
        System.out.println("Could not find address");
        }
         */

        // getlocalhost
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
        } catch (UnknownHostException ex) {
            System.out.println("Could not find address");
        }

    }
}