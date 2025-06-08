import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> gathered = names.stream()
                .collect(Collectors.toList());
        System.out.println(gathered);

        Set<String> uniqueNames = names.stream()
                .collect(Collectors.toSet());
        System.out.println(uniqueNames);

        Map<String, Integer> nameLengths = names.stream()
                .collect(Collectors.toMap(name -> name, name -> name.length()));
        System.out.println(nameLengths);

        List<String> names2 = Arrays.asList("Anna", "Bob", "Alexander", "Amanda", "John");

// Example: Custom filter — names longer than 5 characters
        List<String> longNames = names2.stream()
                .filter(name -> name.length() > 5) // <--- YOUR OWN FILTER
                .collect(Collectors.toList());

        System.out.println(longNames); // [Alexander]


        String result = names2.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.joining(", ")); // gathering as String

        System.out.println(result); // "Anna, Alexander, Amanda"


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0) // only even numbers
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum); // 6 (2 + 4)

        List<String> result3 = names2.stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result3);


    }
}
