public class Person{
	
	public void printData(String firstName, String lastName, int age){
		System.out.println("You have " + age + " years old");
		System.out.println("Your name is: " + firstName + " " + lastName);
	}

	public String getName(String firstName, String lastName){
		String completeName = "Your name is: " + firstName + " " + lastName;
		return completeName;
	}
}