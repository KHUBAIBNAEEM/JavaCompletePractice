package ENCAPSULATION.PRAC;

class Account {
    private String Owner;
    private double Balance;

    public Account(String Owner, double Balance) {
        this.Balance = Balance;
        this.Owner = Owner;
    }

    public double getBalance() {
        return Balance;
    }

    public String getOwner() {
        return Owner;
    }

    public double deposit(double amount) {
        if (amount > 0) Balance += amount;
        return Balance;
    }

    public double withdraw(double amount) {
        if (amount > 0 && amount <= Balance) Balance -= amount;
        return Balance;
    }
}

public class EncapsulationClassAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("Khubaib", 2100000);
        acc1.deposit(3100000);
        acc1.withdraw(1000000);

        System.out.println("Owner: " + acc1.getOwner());
        System.out.println("Balance: " + acc1.getBalance());
    }
}
