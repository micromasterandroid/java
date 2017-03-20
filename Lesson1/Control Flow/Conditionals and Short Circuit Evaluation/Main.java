public class Main{
	public static void main(String[] args) {
		System.out.println("Let's check the first table...");
		boolean food = hotFood();
		boolean table = tableServed();
		/*hotFood() && tableServed()*/ /*tableServed() && hotFood()*/   /*tableServed() || hotFood()*/ /*hotFood() || tableServed()*/
		if(table && food ){
			System.out.println("Time to eat");
		}else{
			System.out.println("Let's wait");
		}
	}

	public static boolean hotFood(){
		System.out.println("Evaluating hotFood!");
		return true;
	}

	public static boolean tableServed(){
		System.out.println("Evaluating tableServered!");
		return false;
	}
}