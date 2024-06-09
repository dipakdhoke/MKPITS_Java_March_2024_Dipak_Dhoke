package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringReversedMap49 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        Map<String, String> reversedMap = strings.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> new StringBuilder(s).reverse().toString()
                ));
        System.out.println(reversedMap);  // Output: {banana=ananab, cherry=yrrehc, apple=elppa}
    }
}
