package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-3, -1, 0, 2, 4, -2);
        List<Integer> positiveNumbers = numbers.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
        System.out.println(positiveNumbers);  // Output: [0, 2, 4]
    }
}
