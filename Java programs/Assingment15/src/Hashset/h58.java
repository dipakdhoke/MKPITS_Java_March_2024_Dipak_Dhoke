package Hashset;

import java.util.HashSet;

public class h58 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        HashSet<String> set2 = new HashSet<>();
        set2.add("A");
        set2.add("B");
        set2.add("D");

        // Compare sets
        boolean areEqual = set1.equals(set2);
        System.out.println("Are the sets equal? " + areEqual);
    }
}
