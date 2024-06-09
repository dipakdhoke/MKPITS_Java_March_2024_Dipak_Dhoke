package assingn20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterout {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "fig");
        List<String> longStrings = strings.stream()
                .filter(s -> s.length() >= 5)
                .collect(Collectors.toList());
        System.out.println(longStrings);  // Output: [apple, banana]
    }
}
