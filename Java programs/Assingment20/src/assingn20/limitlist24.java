package assingn20;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class limitlist24 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            List<Integer> limited = numbers.stream().limit(3).collect(Collectors.toList());
            System.out.println(limited);  // Output: [1, 2, 3]
        }
    }
