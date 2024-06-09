package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsWithSeparator28 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        String result = strings.stream()
                .collect(Collectors.joining(" - "));
        System.out.println(result);  // Output: apple - banana - cherry - date
    }
}
