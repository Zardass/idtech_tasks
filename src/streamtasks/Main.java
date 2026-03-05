package streamtasks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        filterEvenNumbers();
        stringToUppercase();
        countElements();
        removingNullValues();
        firstElementWithA();
        squareAndSort();
        SumOfAllEvenNumbers();
        convertListToMap();
        findMaximumValue();
        countLengths();
        findDuplicates();
        flatten();
        printElements();
        filterNumbers();
        multiplyNumbers();
        findLengths();
        checkIfAnyNumberIsEven();
        checkIfAllNumbersArePositive();
        checkIfNoNumberIsNegative();
        sortingSortAlphabetically();
        sortDescendingOrder();
        findMinimumNumber();
        findFirstElement();
        skipElements();
        limitElements();
        distinctElements();
        convertString();
        joinWithComma();
        sum();
        countTotalElements();
        checkIsEmpty();
        convertSet();
        sortBySalary();
        averageSalary();
    }

    //1
    static void filterEvenNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6)
                .stream()
                .filter(x -> x % 2 == 0).toList();

        System.out.println("filter even numbers: " + numbers);
    }

    static void stringToUppercase() {
        List<String> names = List.of("java", "stream", "api")
                .stream()
                .map(String::toUpperCase).toList();

        System.out.println("converting String to uppercase: " + names);
    }

    static void countElements() {
        List<Integer> nums = List.of(5, 10, 15, 20);
        long count = nums.stream().filter(x -> x > 10).count();

        System.out.println("count elements greater than 10: " + count);
    }

    static void removingNullValues() {
        List<String> data = Arrays.asList("A", null, "B", null, "C")
                .stream()
                .filter(elements -> elements != null)
                .toList();

        System.out.println("remove null values from list: " + data);
    }

    static void firstElementWithA() {
        List<String> names = List.of("Bob", "Alice", "Andrew", "Charlie")
                .stream()
                .filter(x -> x.startsWith("A")).toList();

        System.out.println("Find the First Element Starting with \"A\" :  " + names);
    }

    static void squareAndSort() {
        List<Integer> numbers = List.of(3, 1, 4, 2).stream()
                .map(x -> x * x)
                .sorted().toList();
        System.out.println("Square and Sort each number: " + numbers);
    }

    static void SumOfAllEvenNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        int sum = numbers.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println("Sum of All Even Numbers: " + sum);
    }

    static void convertListToMap() {
        List<String> words = List.of("apple", "banana", "kiwi");
        Map<String, Integer> converting = words.stream()
                .collect(Collectors.toMap(value -> value, value -> value.length()));
        System.out.println("converting list to map: " + converting);
    }

    static void findMaximumValue() {
        List<Integer> numbers = List.of(10, 50, 30);
        int max = numbers.stream().max(Integer::compareTo).orElse(-1);
        System.out.println("max: " + max);
    }

    static void countLengths() {
        List<String> words = List.of("a", "bb", "ccc", "dd");
        List<Integer> count = words.stream().map(x -> x.length()).toList();
        System.out.println("count lengths: " + count);
    }

    static void findDuplicates() {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 3, 5);
        Set<Integer> nums = new HashSet<>();

        Set<Integer> duplicates = numbers.stream()
                .filter(x -> !nums.add(x))
                .collect(Collectors.toSet());

        System.out.println("find duplicates: " + duplicates);
    }

    //14 15
    static void flatten() {
        List<List<String>> list = List.of(
                List.of("A", "B"),
                List.of("C", "D")
        );
        List<String> flatten = list.stream()
                .flatMap(x -> x.stream())
                .toList();
        System.out.println("flatten: " + flatten);
    }

    //16
    static void printElements() {
        List<String> names = List.of("A", "B", "C");
        Stream<String> name = names.stream();
        System.out.println("print elements: " + name.toList());
    }

    //17
    static void filterNumbers() {
        List<Integer> numbers = List.of(1, 4, 6, 8, 2)
                .stream().filter(x -> x >= 5).toList();
        System.out.println("filter numbers: " + numbers);
    }

    //18
    static void multiplyNumbers() {
        List<Integer> numbers = List.of(1, 2, 3)
                .stream()
                .map(x -> x * 2).toList();
        System.out.println("multiply numbers: " + numbers);

    }

    //19
    static void findLengths() {
        List<String> words = List.of("java", "stream");
        List<Integer> lengths = words.stream().map(x -> x.length()).toList();
        System.out.println("find lengths: " + lengths);
    }

    //20
    static void checkIfAnyNumberIsEven() {
        List<Integer> numbers = List.of(1, 3, 5, 6);
        boolean isEven = numbers.stream().anyMatch(x -> x % 2 == 0);
        System.out.println("check If Any Number Is Even: " + isEven);
    }

    //21
    static void checkIfAllNumbersArePositive() {
        List<Integer> numbers = List.of(1, 2, 3, -1);
        boolean isPositive = numbers.stream().allMatch(x -> x > 0);
        System.out.println("check If All Numbers Are Positive: " + isPositive);
    }

    //22
    static void checkIfNoNumberIsNegative() {
        List<Integer> numbers = List.of(1, 2, 3);
        boolean isNegative = numbers.stream().anyMatch(x -> x < 0);
        System.out.println("check If No Number Is Negative: " + isNegative);
    }

    //23
    static void sortingSortAlphabetically() {
        List<String> names = List.of("Banana", "Apple", "Mango")
                .stream()
                .sorted()
                .toList();
        System.out.println("Sort Alphabetically: " + names);
    }

    //24
    static void sortDescendingOrder() {
        List<Integer> numbers = List.of(4, 1, 7, 2)
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Sort Descending Order: " + numbers);
    }

    //25
    static void findMinimumNumber() {
        List<Integer> numbers = List.of(9, 3, 6);
        int minimum = numbers.stream().min(Integer::compareTo).get();
        System.out.println("minimum: " + minimum);
    }

    //26
    static void findFirstElement() {
        List<String> names = List.of("Java", "Python", "C++");
        String first = names.stream().findFirst().get();
        System.out.println("first element: " + first);
    }

    //27
    static void skipElements() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5)
                .stream()
                .skip(2).toList();
        System.out.println("skip 2 elements: " + numbers);
    }

    //28
    static void limitElements() {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50).stream()
                .limit(3).toList();
        System.out.println("limit 3 elements: " + numbers);
    }

    //29
    static void distinctElements() {
        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 4)
                .stream()
                .distinct().toList();
        System.out.println("Remove Duplicate Elements: " + numbers);
    }

    //30
    static void convertString() {
        List<Integer> numbers = List.of(1, 2, 3);
        Stream<String> strings = numbers.stream().map(x -> x.toString());
        System.out.println("Convert String to String: " + strings.toList());
    }

    //31
    static void joinWithComma() {
        List<String> words = List.of("A", "B", "C");
        String join = words.stream().collect(Collectors.joining(","));
        System.out.println("Join With Comma: " + join);
    }

    //32
    static void sum() {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        int sum = numbers.stream().reduce(0, (a, b) -> (a + b));
        System.out.println("Sum: " + sum);
    }

    //33
    static void countTotalElements() {
        List<String> items = List.of("pen", "pencil", "eraser");
        long count = items.stream().count();
        System.out.println("Total Elements: " + count);
    }

    //34
    static void checkIsEmpty() {
        List<String> list = List.of();
        boolean isEmpty = list.isEmpty();
        System.out.println("Empty List: " + isEmpty);
    }

    //35
    static void convertSet() {
        List<String> names = List.of("A", "B", "A");
        Set<String> set = names.stream().collect(Collectors.toSet());
        System.out.println("Set: " + set);
    }

    //14
    static void sortBySalary() {
        List<Employee> employees = List.of(
                new Employee("Zarda", 2000),
                new Employee("Lyalka", 2400),
                new Employee("Salim", 1500)
        );
        List<Employee> sorted =
                employees.stream()
                        .sorted(Comparator.comparing(e -> e.salary)).toList();

        System.out.println(sorted);

    }

    //15
    static void averageSalary() {
        List<Employee> employees = List.of(
                new Employee("Zarda", 2000),
                new Employee("Lyalka", 2400),
                new Employee("Salim", 1500)
        );
        double averageSum = employees.stream()
                .map(e -> e.salary)
                .reduce(0.0, (a, b) -> (a + b));
        System.out.println("Average Salary: " + averageSum);
    }
}

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

