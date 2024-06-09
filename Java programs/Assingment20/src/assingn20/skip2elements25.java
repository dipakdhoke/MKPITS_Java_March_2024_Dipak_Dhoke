package assingn20;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class skip2elements25 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            List<Integer> skipped = numbers.stream().skip(2).collect(Collectors.toList());
            System.out.println(skipped);  // Output: [3, 4, 5]
        }
    }

