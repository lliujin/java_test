import java.net.*;
import java.io.*;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("192.168.1.180", 6666);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("hello server!");
        dos.flush();
        dos.close();
        s.close();
    }
}