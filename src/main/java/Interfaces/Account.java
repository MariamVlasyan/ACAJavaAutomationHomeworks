package Interfaces;

public interface Account {
   double getBalance();
   void deposit(double amount);
   void withdraw(double amount);
   String getAccountNumber();
   String getOwnerName();
   String toString();
        
}
