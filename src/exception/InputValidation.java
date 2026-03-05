package exception;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter your age: ");
        int age = scanner.nextInt();

        try{
            if (age <= 0 || age > 120){
               throw new IllegalArgumentException("age cannot be negative or greater than 120");
            }
            System.out.println("Success!");
        }
        catch(IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }

    }

}

