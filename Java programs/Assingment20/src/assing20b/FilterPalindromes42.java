package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPalindromes42 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("level", "banana", "civic", "apple");
        List<String> nonPalindromes = strings.stream()
                .filter(s -> !s.equals(new StringBuilder(s).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println(nonPalindromes);  // Output: [banana, apple]
    }
}

