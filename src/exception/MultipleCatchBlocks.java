package exception;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        String s = null;
        try{
            System.out.println(num1%num2);
            System.out.println(s.length());
        }
        catch (ArithmeticException exception){
            System.out.println("Arithmetic exception " + exception.getMessage());
        }
        catch (NullPointerException exception){
            System.out.println("NullPointerException " + exception.getMessage());
        }

    }
}
