package Hashset;

import java.util.Arrays;
import java.util.HashSet;

public class h55 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        // Convert to array
        String[] array = set.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(array));
    }
}
