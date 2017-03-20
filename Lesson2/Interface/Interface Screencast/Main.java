/**
 * Main class of the Java program. 
 * 
 */

public class Main {
    public static void main(String[] args) {
        Car taxi = new Car(4);
        System.out.println("Taxi has wheels? " + taxi.hasWheels() + " Number of wheels: " + taxi.getNumberOfWheels());
    }
}
