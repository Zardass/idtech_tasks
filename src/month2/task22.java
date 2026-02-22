package month2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class task22 {
    public static void main(String[] args) {
        groupingAndCounting();
    }
    public static void groupingAndCounting(){
        List<String> names = List.of("Ali", "Aysel", "Murad", "Nigar", "Amin");
        Map<Character, Long> result = names.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.counting()));
        System.out.println(result);

    }
}
