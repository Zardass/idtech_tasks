package month2;

import java.util.Comparator;
import java.util.List;

public class task21 {
    public static void main(String[] args) {
        filteringAndSorting();
    }
    public static void filteringAndSorting(){
        List<Integer> nums = List.of(3, 10, 15, 20, 7, 8)
                .stream()
                .filter(x -> x % 2 != 0)
                .map(x -> x * 3)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("result: " + nums);

    }

}
