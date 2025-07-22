import java.io.*;
import java.net.*;

public class ServerSide {
    public static void main(String[] args) {
        int port = 1234;

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server started. Waiting for client...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println("Hello from Server!");
            out.println("This is a test message.");
            out.println("Bye!");

            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}
