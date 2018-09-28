import java.net.*;
import java.io.*;

public class TestServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            while(true) {
                Socket s = ss.accept();
                OutputStream os = s.getOutputStream();
                DataOutputStream dos = new DataOutputStream(os);
                dos.writeUTF("hello," + s.getInetAddress() + "port#" + s.getPort());
                dos.flush();
                dos.close();
                s.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("program running error!" + e);
        }
    }
}