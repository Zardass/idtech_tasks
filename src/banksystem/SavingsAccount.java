package banksystem;

public class SavingsAccount extends BankAccount{

    @Override
    public void withdraw(double amount) {
        if(amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Savings account withdrawal successful, Remaining balance:" +  getBalance());
        }
        else {
            System.out.println("Savings account withdrawal failed");
        }


    }

    @Override
    public void deposit(double amount) {
        if(amount > 0){
           setBalance(getBalance() + amount);
        }
        System.out.println("Deposited " + amount + " to  account");

    }
}
