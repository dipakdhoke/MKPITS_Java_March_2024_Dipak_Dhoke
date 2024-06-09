package assingn20;


import java.util.Arrays;
import java.util.List;

public class nonempty19 {
        public static void main(String[] args) {
            List<String> strings = Arrays.asList("apple", "banana", "cherry");
            boolean allNonEmpty = strings.stream().allMatch(s -> !s.isEmpty());
            System.out.println(allNonEmpty);  // Output: true
        }
    }

