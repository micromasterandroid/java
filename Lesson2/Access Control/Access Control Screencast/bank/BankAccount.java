package bank;

public class BankAccount {
    public int number;
    private double balance;
    
    public BankAccount(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }
    
    protected boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance = balance - amount;
            return true;
        }
        return false;
    }
}