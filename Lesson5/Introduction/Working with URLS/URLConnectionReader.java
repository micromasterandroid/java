import java.net.*;
import java.io.*;

public class URLConnectionReader {
    public static void main(String[] args) throws Exception {
      URL oracle = new URL("http://www.example.com/docs/resource1.html");
      URLConnection yc = oracle.openConnection();
      BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
      String inputLine;
      while((inputLine = in.readLine()) != null)
        System.out.println(readLine);
      in.close();
    }
}
