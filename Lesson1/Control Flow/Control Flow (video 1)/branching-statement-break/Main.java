/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        int number = 1;
        loopNumber(number);
    }
    
    public static void loopNumber(int newNumber){
        while(newNumber >= 0){
            if(newNumber < 10){
                newNumber++;
                continue;
            }
            System.out.println(newNumber);
            System.out.println("Done");
            break;
        }
    }
}
