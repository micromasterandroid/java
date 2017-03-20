public class Main{
	
	public static boolean isEven(int number){
		int result = number % 2;
		if(result>0){
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int number = 127;
		boolean isEven = isEven(number);
		if(isEven){
			System.out.println(number + " is an even number");
		}else if(!isEven){
			System.out.println(number + " is an odd number");

		}
	}


}