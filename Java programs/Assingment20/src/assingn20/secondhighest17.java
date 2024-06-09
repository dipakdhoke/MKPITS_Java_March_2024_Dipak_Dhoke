package assingn20;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class secondhighest17 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
            Optional<Integer> secondHighest = numbers.stream()
                    .sorted((a, b) -> b - a)
                    .skip(1)
                    .findFirst();
            secondHighest.ifPresent(System.out::println);  // Output: 5
        }
    }

