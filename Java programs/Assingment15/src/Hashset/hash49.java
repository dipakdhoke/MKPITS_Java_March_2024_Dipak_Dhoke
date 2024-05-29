package Hashset;

import java.util.HashSet;

public class hash49 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");

        // Append element
        set.add("C");
        System.out.println("Updated Set: " + set);
    }
}
