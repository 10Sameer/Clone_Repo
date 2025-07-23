import java.net.*;
import java.io.*;

public class AuthenticatorExample {

    public static void main(String[] args) {
        try {
            // Set the default Authenticator
            Authenticator.setDefault(new MyAuthenticator());
            URL url = new URL("http://example.com/protected");
            URLConnection connection = url.openConnection();

 