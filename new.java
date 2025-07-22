import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // or use IP address like "127.0.0.1"
        int port = 1234;

        try {
            // 1. Connect to the server
            Socket socket = new Socket(serverAddress, port);
            System.out.println("Connected to server!");

            // 2. Read data from server
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println("Server says: " + line);
            }

            // 3. Close everything
            in.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}
