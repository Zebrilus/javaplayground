import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class SSLTest {

    public SSLTest() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) throws IOException {
        String urlString;
        if(args.length == 0) {
            urlString = "https://shop.kamehabonn.de";
        } else {
            urlString = args[0];
        }
        URL url = new URL(urlString);
        InputStream openStream = url.openStream();
        BufferedReader buf = new BufferedReader(new InputStreamReader(openStream));
        String line = null;
        while ((line = buf.readLine()) != null) {
            System.out.println(line);
        }
        buf.close();
    }

}
