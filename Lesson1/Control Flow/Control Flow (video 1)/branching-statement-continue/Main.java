/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
       int number = 1;
       String value = loopNumber(number);
       System.out.println(value);
    }
    
    public static String loopNumber(int newNumber){
        while(newNumber >= 0){
            if(newNumber < 10){
                newNumber++;
                continue;
            }
            System.out.println(newNumber);
            return "Done";
        }
        return newNumber + " is negative";
    }
}
