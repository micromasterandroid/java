public class Account{
	
	public static int nextAccount = 1;

	public String name;
	public int accountNumber;
	public int balance;

	public Account(String n){
		name = new String(n);
		accountNumber = nextAccount;
		balance = 0;

		nextAccount++;
	}

	public Account(String n, int b){
		name = new String(n);
		accountNumber = nextAccount;
		balance = b;

		nextAccount++;
	}

	public void deposit(int b){
		balance = balance + b;
	}

	public String toString(){
		return "\nname: " + name + "\naccount number: " + accountNumber + "\nbalance: " + balance;
	}
}