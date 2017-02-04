import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//Just reading bytes
public class FileStreams {
    public static void main(String[] args) throws Exception {
        FileInputStream input = null;
        FileOutputStream output = null;

        //Byte per Byte
        try {
            input = new FileInputStream("listofFigures.txt");
            output = new FileOutputStream("listofFigures_out.txt");
            
            int character;
            
            while( (character = input.read()) != -1 ){
                System.out.printf("0x%02X",character);
                System.out.print("\n");
                output.write(character);
            }
        } finally {
            if (input != null){
                input.close();
            }
            if (output != null){
                input.close();
            }
        }
    }
}