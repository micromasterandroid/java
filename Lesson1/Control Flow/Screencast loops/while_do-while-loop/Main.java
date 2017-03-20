/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        //while example
        int sequenceWhile = 9;
        while(sequenceWhile < 10){
            System.out.println("while: " + sequenceWhile);
            sequenceWhile++;
        }
        //do-while example
        int sequenceDoWhile = 10;
        do{
            System.out.println("do-while: " + sequenceDoWhile);
            sequenceDoWhile++;
        }while(sequenceDoWhile < 10);
    }
}
