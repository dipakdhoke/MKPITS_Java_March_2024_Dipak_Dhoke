package assingn20;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.Optional;

public class longestString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        Optional<String> longestString = strings.stream()
                .max(Comparator.comparingInt(String::length));
        longestString.ifPresent(System.out::println);  // Output: banana
    }
}

