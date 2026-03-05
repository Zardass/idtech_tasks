package exception;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        try{
            if (age < 18){
                throw new InvalidAgeException("your age must be greater than 18");
            }
            System.out.println("Success!");
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}

 class InvalidAgeException extends RuntimeException {
     public InvalidAgeException(String message) {
         super(message);
     }
 }
