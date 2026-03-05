package banksystem;

public abstract class BankAccount {
    private double balance;

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
