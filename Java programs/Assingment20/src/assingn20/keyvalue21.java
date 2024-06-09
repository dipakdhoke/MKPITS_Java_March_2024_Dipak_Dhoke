package assingn20;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class keyvalue21 {
        public static void main(String[] args) {
            List<String> strings = Arrays.asList("apple", "banana", "cherry");
            Map<String, Integer> stringLengthMap = strings.stream()
                    .collect(Collectors.toMap(s -> s, String::length));
            System.out.println(stringLengthMap);  // Output: {apple=5, banana=6, cherry=6}
        }
    }

