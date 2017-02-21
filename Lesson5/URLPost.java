import java.io.*;
import java.net.*;

public class URLPost {
    public static void main(String[] args) throws Exception {

        // Check the input arguments, has to be the url and a value to post
        if (args.length != 2) {
            System.err.println("Usage:  java post "
                + "http://<Server Location/script>"
                + " name_to_post");
            System.exit(1);
        }


        // Encode the value to post string to avoid problem with special characters.
        String stringToPost = URLEncoder.encode(args[1], "UTF-8");

        // create the URL Object and open a connection
        URL url = new URL(args[0]);
        URLConnection connection = url.openConnection();
        // Enable write capability on the url
        connection.setDoOutput(true);
        // get the connection outputstream, write to it and close it
        OutputStreamWriter out = new OutputStreamWriter(
                                         connection.getOutputStream());

        //Write to de connection, the method write will do a http post to the url.
        out.write("name=" + stringToPost);
        out.close();

        // Get the connection inputstream,
        BufferedReader in = new BufferedReader(
                                    new InputStreamReader(
                                    connection.getInputStream()));
        String welcomeMessage;
        // read the returned lines and print to standar output
        while ((welcomeMessage = in.readLine()) != null) {
            System.out.println(welcomeMessage);
        }
        in.close();
    }
}