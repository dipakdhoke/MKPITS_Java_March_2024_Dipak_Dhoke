package assing20b;

import java.util.Arrays;
import java.util.List;

public class TotalLengthOfStrings32 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "fig");
        int totalLength = strings.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(totalLength);  // Output: 22
    }
}

