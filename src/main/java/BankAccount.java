import Enums.AccountType;
import Interfaces.Account;

public class BankAccount implements Account {
    double balance;
    String accountNumber;
    String ownerName;
    AccountType accountType;

    public BankAccount(double balance, String accountNumber, String ownerName, AccountType accountType) {
        this.balance = 0.0;
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.accountType = accountType;
    }

    //getBalance(): a method that returns a double representing the current balance of the account.
    public double getBalance() {
        return balance;
    }

    // deposit(double amount): a method that takes in a double representing the amount to deposit and adds it to the balance.
    public void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
    }

    // withdraw(double amount): a method that takes in a double representing the amount to withdraw and subtracts it from the balance (if the balance is sufficient).
    public void withdraw(double amount) {
        if (getBalance() > 0) {
           double currentBalance = getBalance() - amount;
        } else System.out.println("Your balance is amount is 0");
    }

    //getAccountNumber(): a method that returns a String representing a unique identifier for the account.
    public String getAccountNumber() {
        String uIdD = getOwnerName() + 1;
        System.out.println("Unic ID is:" + uIdD);
        return uIdD.toString();
    }

    //getOwnerName(): a method that returns a String representing the name of the account owner.
    public String getOwnerName() {
        return ownerName;
    }

    //toString(): a method that returns a String representation of the account, including the account number, owner name, and current balance.
    @Override
    public String toString() {
        return super.toString(accountNumber,ownerName, balance);
    }

    public class SavingsAccount extends BankAccount(double time)
    {
        double interestRate;
        double calculateInterest (String time) {
         return (balance * (interestRate / 100) * time));

    }
    }
}
