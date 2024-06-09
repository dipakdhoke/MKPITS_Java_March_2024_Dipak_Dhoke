package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageLengthOfStrings39 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "fig");
        OptionalDouble averageLength = strings.stream()
                .mapToInt(String::length)
                .average();
        averageLength.ifPresent(System.out::println);  // Output: 5.5
    }
}
