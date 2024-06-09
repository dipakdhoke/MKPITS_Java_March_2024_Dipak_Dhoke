package assing20b;

import java.util.Arrays;
import java.util.List;

public class CountStringsContainingE37 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        long count = strings.stream()
                .filter(s -> s.contains("e"))
                .count();
        System.out.println(count);  // Output: 3
    }
}

