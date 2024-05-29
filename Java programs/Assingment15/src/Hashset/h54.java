package Hashset;

import java.util.HashSet;

public class h54 {
    public static void main(String[] args) {
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("A");
        originalSet.add("B");
        originalSet.add("C");

        // Clone set
        HashSet<String> clonedSet = (HashSet<String>) originalSet.clone();
        System.out.println("Cloned Set: " + clonedSet);
    }

}
