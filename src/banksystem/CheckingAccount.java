package banksystem;

public class CheckingAccount extends BankAccount {

    @Override
    public void withdraw(double amount) {
        if(amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw Successful, Remaining balance:" +  getBalance());
        }
        else{
            System.out.println("Withdraw Failed");
        }

    }

    @Override
    public void deposit(double amount) {
        if(amount > 0){
            setBalance(getBalance() + amount);
        }
        System.out.println("Deposit Successful, new Balance:" +  getBalance());
    }
}
