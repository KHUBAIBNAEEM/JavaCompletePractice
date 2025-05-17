import java.util.*;

class Account {
    Scanner sc = new Scanner (System.in);
    double balance = sc.nextDouble();

    
    public Account() { // constructor
        System.out.println("The current balance: " + balance); 
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

    public class ClassesAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(200);
        account.withdraw(100);
        account.displayBalance();
    }
}



