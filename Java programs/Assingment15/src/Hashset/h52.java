package Hashset;

import java.util.HashSet;

public class h52 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        // Empty the set
        set.clear();
        System.out.println("Updated Set: " + set);
    }
}
