package exception;

public class DivisionByZero {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;

        try {
            System.out.println(a + "/" + b + "=" + (a / b));
        }
        catch (ArithmeticException exception){
            throw new ArithmeticException("Division by zero not allowed");
        }
    }
}
