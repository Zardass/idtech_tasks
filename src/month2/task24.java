package month2;

import java.util.List;

public class task24 {
    public static void main(String[] args) {

        filtering();
    }
    public static void filtering(){
        List<Integer> nums = List.of(1, 2, 3, 4, 5).stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .toList();
        System.out.println(nums);

    }
}
