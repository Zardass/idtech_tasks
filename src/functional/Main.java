package functional;

public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> (a + b);
        Calculator multiplication = (a, b) -> (a * b);

        System.out.println("addition:" + add.operate(3,5));
        System.out.println("multiplication:" + multiplication.operate(4,6));

    }

    public interface Calculator {
        int operate(int a ,int b);
    }

}

