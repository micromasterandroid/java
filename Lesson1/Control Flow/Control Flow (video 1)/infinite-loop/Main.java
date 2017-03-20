/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("While loop: Starting...");
        int number = 1;
        while(number > 0){
                System.out.println(number);
                number = number + 1;
        }
        System.out.println("While loop: Done.");
        System.out.println("Do While loop: Starting...");
        int number2 = 1;
        do{
            System.out.println(number2);
            number2 = number2 + 1;
        }while(number2 > 0);
        System.out.println("Do while loop: Done.");
    }
}
