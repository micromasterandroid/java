/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        Human connie = new Human("Connie", "Smith", 'F');
		connie.setBirthDate(1987,1,22); //January 22th, 1987
		System.out.println(connie.getFullName() + " is "+ connie.getAge() + " years old");	

		Human john = new Human("John", "Brown", 'M');
		john.setBirthDate(1986,12,8);//December 08th, 1986
		System.out.println(john.getFullName() + " is "+ john.getAge() + " years old");	
		connie.addPartner(john);
		System.out.println(connie.getFullName() + "'s partner is " +  connie.getPartnerName());
		System.out.println(john.getFullName() + "'s partner is " +  john.getPartnerName());
    }
}
