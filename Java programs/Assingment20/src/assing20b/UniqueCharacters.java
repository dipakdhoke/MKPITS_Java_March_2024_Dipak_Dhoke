package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueCharacters {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        Set<Character> uniqueChars = strings.stream()
                .flatMapToInt(String::chars)
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
        System.out.println(uniqueChars);  // Output: [a, b, c, e, h, l, n, p, r, y]
    }
}

