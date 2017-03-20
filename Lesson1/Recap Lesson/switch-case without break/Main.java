public class Main{
	public static void main(String[] args) {
		int number = 8;
		switch (number) {
			case 1: case 2 : case 3: case 4: case 5:{
				System.out.println("The number is between 1 and 5.");
				break;
			}
			case 6: case 7 : case 8: case 9: case 10:{
				System.out.println("The number is between 6 and 10.");
				break;
			}
			default:{
				System.out.println("The number is greater than 10");
				break;
			}		
		}
	}
}