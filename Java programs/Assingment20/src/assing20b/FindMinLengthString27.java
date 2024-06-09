package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.Optional;

public class FindMinLengthString27 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "fig");
        Optional<String> minLengthString = strings.stream()
                .min(Comparator.comparingInt(String::length));
        minLengthString.ifPresent(System.out::println);  // Output: fig
    }
}

