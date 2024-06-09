package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbersGreaterThan46 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int threshold = 3;
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n <= threshold)
                .collect(Collectors.toList());
        System.out.println(filteredNumbers);  // Output: [1, 2, 3]
    }
}

