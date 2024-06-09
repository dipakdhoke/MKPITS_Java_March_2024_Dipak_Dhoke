package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparatedString36 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        String result = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(result);  // Output: 1, 2, 3, 4, 5
    }
}

