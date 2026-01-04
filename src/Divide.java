import exception.InvalidException;

public class Divide {
    public static void main(String[] args) {
        divide(2,0);
    }
    public static  void divide(int  a,int b){
        try {
            if(b == 0){
                throw new InvalidException("Division by zero");
            }
        }
        catch (InvalidException e) {
            System.out.println(e.getMessage());
        }
    }

}
