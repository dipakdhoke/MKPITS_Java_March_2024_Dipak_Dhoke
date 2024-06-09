package assingn20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        String concatenated = strings.stream().collect(Collectors.joining(", "));
        System.out.println(concatenated);  // Output: apple, banana, cherry
    }
}

