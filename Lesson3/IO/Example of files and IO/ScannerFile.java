import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

//Search for Tokens, delimited
public class ScannerFile {
    public static void main(String[] args) throws Exception {
        Scanner input = null;

        //Token per Token
        try {
            input = new Scanner( new BufferedReader( new FileReader("listofFigures.txt") ) );
            
            while( input.hasNext() ){
                System.out.print(" > " + input.next() + "\n");
            }
        } finally {
            if (input != null){
                input.close();
            }
        }
    }
}