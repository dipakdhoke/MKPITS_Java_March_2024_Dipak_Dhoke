package assing20b;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenListOfLists41 {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("cherry", "date"),
                Arrays.asList("fig", "grape")
        );
        List<String> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flattenedList);  // Output: [apple, banana, cherry, date, fig, grape]
    }
}

