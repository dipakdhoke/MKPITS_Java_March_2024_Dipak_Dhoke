package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class MostOccurrencesOfA44 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        String mostAString = strings.stream()
                .max(Comparator.comparingLong(s -> s.chars().filter(c -> c == 'a').count()))
                .orElse(null);
        System.out.println(mostAString);  // Output: banana
    }
}

