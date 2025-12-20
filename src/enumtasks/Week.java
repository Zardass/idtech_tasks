package enumtasks;

import java.util.Locale;
import java.util.Scanner;

public enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    private static final Scanner sc = new Scanner(System.in);

    public static void findDay(){
        System.out.print("Enter day of week: ");
        String input = sc.nextLine();
        Week day = Week.valueOf(input);
        System.out.println(day);

    }
}

