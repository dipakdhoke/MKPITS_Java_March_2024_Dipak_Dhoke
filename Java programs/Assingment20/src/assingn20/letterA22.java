package assingn20;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class letterA22 {
        public static void main(String[] args) {
            List<String> strings = Arrays.asList("apple", "banana", "apricot");
            Optional<String> startsWithA = strings.stream().filter(s -> s.startsWith("A")).findFirst();
            startsWithA.ifPresent(System.out::println);  // Output: apple
        }
    }

