/**
 * Main class of the Java program. 
 * 
 */
import bank.BankAccount;
import bank.BankTeller;
import atm.ATM;

public class Main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(1234,100.00);
        BankTeller john = new BankTeller();
        john.deposit(a,100.00);
        ATM xyz = new ATM(222);
        xyz.withdraw(a,50.00);
    }
}
