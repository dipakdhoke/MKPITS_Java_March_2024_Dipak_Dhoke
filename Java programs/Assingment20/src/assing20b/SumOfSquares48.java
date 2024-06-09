package assing20b;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares48 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumOfSquares = numbers.stream()
                .mapToInt(n -> n * n)
                .sum();
        System.out.println(sumOfSquares);  // Output: 55
    }
}
