package enumtasks;

import java.util.Scanner;

public enum TrafficLights {
    RED,
    YELLOW,
    GREEN;

    public static  void  switchExample() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your choice: ");
        String choice = input.nextLine();

        TrafficLights lihgts = TrafficLights.valueOf(choice);
        switch (lihgts) {
            case RED -> System.out.println("Stop");
            case YELLOW -> System.out.println("Get ready");
            case GREEN -> System.out.println("Start");
            default -> System.out.println("Invalid choice");
        }
    }
}
