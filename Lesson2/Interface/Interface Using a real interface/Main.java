/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        
        PokerCard eightOfSpades = new PokerCard(4, 8);
        PokerCard tenOfHearts = new PokerCard(3, 10);
        
        System.out.println(eightOfSpades.compareTo(tenOfHearts));
        
        System.out.println(tenOfHearts.compareTo(eightOfSpades));
        
        System.out.println(eightOfSpades.compareTo(eightOfSpades));
    }
}
