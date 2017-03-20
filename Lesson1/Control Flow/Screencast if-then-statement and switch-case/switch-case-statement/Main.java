/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        int birthMonth = 4;
        
        switch(birthMonth){
            case 1:
                System.out.println("You where born in January");
                break;
            case 2:
                System.out.println("You where born in February");
                break;
            case 3:
                System.out.println("You where born in March");
                break;
            case 4:
                System.out.println("You where born in April");
                break;
            case 5:
                System.out.println("You where born in May");
                break;
            case 6:
                System.out.println("You where born in June");
                break;
            case 7:
                System.out.println("You where born in July");
                break;
            case 8:
                System.out.println("You where born in Agust");
                break;
            case 9:
                System.out.println("You where born in September");
                break;
            case 10:
                System.out.println("You where born in October");
                break;
            case 11:
                System.out.println("You where born in November");
                break;
            case 12:
                System.out.println("You where born in December");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
}
