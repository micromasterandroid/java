package bank;

public class BankTeller {
    
    public void deposit(BankAccount account, double amount) {
        boolean result = account.deposit(amount);
        if (result) {
            System.out.println("Successful deposit of $" + amount);
        } else {
            System.out.println("Error!");
        }
    }
    
    public void withdraw(BankAccount account, double amount) {
        boolean result = account.withdraw(amount);
        if (result) {
            System.out.println("Successful withdraw of $" + amount);
        } else {
            System.out.println("Error!");
        }
    }
}
