package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseStringList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "fig");
        List<String> reversedStrings = strings.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), lst -> {
                    Collections.reverse(lst);
                    return lst.stream();
                }))
                .collect(Collectors.toList());
        System.out.println(reversedStrings);  // Output: [fig, cherry, banana, apple]
    }
}
