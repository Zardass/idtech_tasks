package banksystem;

public class Main {
    public static void main(String[] args) {

        BankAccount savingsAccount = new SavingsAccount();
        BankAccount checkingAccount = new CheckingAccount();

        savingsAccount.deposit(300);
        savingsAccount.withdraw(100);

        checkingAccount.deposit(200);
        checkingAccount.withdraw(10);

    }
}
