package assingn20;



import java.util.Arrays;
import java.util.List;

public class productinteger15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(product);  // Output: 120
    }
}
