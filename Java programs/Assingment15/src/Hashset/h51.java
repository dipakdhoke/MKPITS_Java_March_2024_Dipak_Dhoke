package Hashset;

import java.util.HashSet;

public class h51 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        // Get number of elements
        int size = set.size();
        System.out.println("Number of elements in the set: " + size);
    }

}
