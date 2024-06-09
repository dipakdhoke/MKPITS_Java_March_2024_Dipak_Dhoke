package assingn20;

import java.util.Arrays;
import java.util.List;

public class ContainsLetterA {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "stream");
        boolean containsA = strings.stream()
                .anyMatch(s -> s.contains("a"));
        System.out.println("Any string contains 'a': " + containsA);
    }
}
