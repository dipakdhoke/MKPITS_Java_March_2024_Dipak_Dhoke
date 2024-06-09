package assingn20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class grouplist13 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "fig", "pear");
        Map<Integer, List<String>> groupedByLength = strings.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);  // Output: {3=[fig], 4=[kiwi, pear], 5=[apple], 6=[banana]}
    }
}

