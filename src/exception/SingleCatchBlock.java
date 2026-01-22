package exception;

public class SingleCatchBlock {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        String word = null;
        try{
            System.out.println(word.length());
            System.out.println(a/b);
        }
        catch (ArithmeticException | NullPointerException exception){
            System.out.println("something is wrong " + exception.getMessage());
        }
    }
}
