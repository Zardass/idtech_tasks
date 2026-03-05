package exception;

public class FinallyBlockPractice {
    public static void main(String[] args) {
        String s = "Zarda";
        try{
            System.out.println(s.charAt(7));
        }
        catch(StringIndexOutOfBoundsException exception){
            throw new StringIndexOutOfBoundsException("Index out of bounds");
        }
        finally {
            System.out.println("Program continues....");
        }
    }
}
