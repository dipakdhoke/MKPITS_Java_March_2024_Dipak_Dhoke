package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicates45 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apple", "cherry", "banana");
        List<String> uniqueStrings = strings.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueStrings);  // Output: [apple, banana, cherry]
    }
}
