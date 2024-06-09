package assingn20;


  import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class removenull26 {
        public static void main(String[] args) {
            List<String> listWithNulls = Arrays.asList("apple", null, "banana", null, "cherry");
            List<String> withoutNulls = listWithNulls.stream()
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            System.out.println(withoutNulls);  // Output: [apple, banana, cherry]
        }
    }

