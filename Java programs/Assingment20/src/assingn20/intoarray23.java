package assingn20;


import java.util.Arrays;
import java.util.List;

public class intoarray23 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            Integer[] array = numbers.stream().toArray(Integer[]::new);
            System.out.println(Arrays.toString(array));  // Output: [1, 2, 3, 4, 5]
        }
    }

