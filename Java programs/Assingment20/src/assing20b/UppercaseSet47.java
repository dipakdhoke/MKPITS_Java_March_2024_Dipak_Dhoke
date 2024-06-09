package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UppercaseSet47 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        Set<String> uppercaseSet = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(uppercaseSet);  // Output: [APPLE, BANANA, CHERRY]
    }
}
