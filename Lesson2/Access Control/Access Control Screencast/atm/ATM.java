package atm;

import bank.BankAccount;

public class ATM {
    private int id;
   
    public ATM(int id) {
        this.id = id;
    }
    
    public void withdraw(BankAccount account, double amount) {
        boolean result = account.withdraw(amount);
        if (result) {
            System.out.println("Successful withdraw on ATM of $" + amount);
        } else {
            System.out.println("Error!");
        }
    }
}
