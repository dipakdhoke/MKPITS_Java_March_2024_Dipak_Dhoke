package assingn20;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listsingle20 {
        public static void main(String[] args) {
            List<List<String>> listOfLists = Arrays.asList(
                    Arrays.asList("a", "b"),
                    Arrays.asList("c", "d")
            );
            List<String> flattenedList = listOfLists.stream()
                    .flatMap(List::stream)
                    .collect(Collectors.toList());
            System.out.println(flattenedList);  // Output: [a, b, c, d]
        }
    }

