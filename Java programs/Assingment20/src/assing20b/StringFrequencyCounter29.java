package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringFrequencyCounter29 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "banana");
        Map<String, Long> frequencyMap = strings.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(frequencyMap);  // Output: {banana=3, apple=2, cherry=1}
    }
}
