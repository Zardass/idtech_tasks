package exception;

public class ExceptionPropagation {
    public static void main(String[] args) {

        method1();
    }

    private static  void method1(){
        try{
            method3();
        }
        catch (Exception exception){
//            throw new ArithmeticException("something is wrong");
            System.out.println("something is wrong: " + exception.getMessage());
        }

    }

    private static  void method2(){
    }

    private static  void method3(){
        System.out.println(10/0);
    }
}
