import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception {
      URL oracle = new URL("http://www.example.com/docs/resource1.html");
      BufferedReader in = new BufferedReader( new InputStreamReader(oracle.openStream()));
      String inputLine;
      while((inputLine = in.readLine()) != null){
        System.out.println(inputLine);
      }
      in.close();
    }
}
