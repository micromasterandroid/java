import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

//Just reading bytes
public class FileReaders {
    public static void main(String[] args) throws Exception {
        FileReader input = null;
        FileWriter output = null;

        //Byte per Byte
        try {
            input = new FileReader("listofFigures.txt");
            output = new FileWriter("listofFigures_out.txt");
            
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