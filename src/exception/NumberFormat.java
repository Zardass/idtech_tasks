package exception;

public class NumberFormat {
    public static void main(String[] args) {
        String num = "123hello";

        try{
            int number = Integer.parseInt(num);
            System.out.println(number);
        }
        catch (Exception exception){
            System.out.println("String cannot be converted to int"  + exception.getMessage());
        }
    }
}
