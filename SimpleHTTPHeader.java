import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleHTTPHeader {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Loop through headers
            for (int i = 0;; i++) {
                String headerName = conn.getHeaderFieldKey(i);
                String headerValue = conn.getHeaderField(i);

                if (headerName == null && headerValue == null) {
                    break; // No more headers
                }

                if (headerName == null) {
                    System.out.println("Status: " + headerValue); // First line (status)
                } else {
                    System.out.println(headerName + ": " + headerValue);
                }
            }

            conn.disconnect();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
