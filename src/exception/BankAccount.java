package exception;

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("cixarilan mebleg en azi 1 manat olmalidir");
        }
        balance += amount;
        System.out.println(balance);
    }

    public void withDrawing(double amount) {
        if (amount > this.balance) {
            throw new InsufficientBalanceException("daxil edilen miqdar hesabdakindan coxdur");
        }
        balance -= amount;
        System.out.println(balance);


    }
}

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Main{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100);
        bankAccount.withDrawing(50);
    }
}

