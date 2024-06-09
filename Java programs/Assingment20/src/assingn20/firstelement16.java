package assingn20;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class firstelement16 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> withoutFirst = numbers.stream().skip(1).collect(Collectors.toList());
        System.out.println(withoutFirst);  // Output: [2, 3, 4, 5]
    }
}

