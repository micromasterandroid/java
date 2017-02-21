import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception {

    	if (args.length != 1) {
            System.err.println("Usage:  java URLReader "
                + "http://<location of your /script>");
            System.exit(1);
        }

        URL page = new URL(args[0]);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(page.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}