package assingn20;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> maxNumber = numbers.stream()
                .max(Integer::compareTo);
        maxNumber.ifPresent(max -> System.out.println("Max number: " + max));
    }
}

