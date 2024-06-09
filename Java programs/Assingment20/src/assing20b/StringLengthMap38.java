package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringLengthMap38 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "fig");
        Map<Integer, List<String>> lengthMap = strings.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(lengthMap);  // Output: {3=[fig], 5=[apple], 6=[banana, cherry]}
    }
}

