package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstLettersList43 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        List<Character> firstLetters = strings.stream()
                .map(s -> s.charAt(0))
                .collect(Collectors.toList());
        System.out.println(firstLetters);  // Output: [a, b, c, d]
    }
}

