import java.net.*;
import java.io.*;

public class URLConnectionReader {
    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.err.println("Usage:  java URLReader "
                + "http://<location of your /script>");
            System.exit(1);
        }
        URL page = new URL(args[0]);
        URLConnection pconn = page.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    pconn.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}