package Hashset;

import java.util.HashSet;

public class h59 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        HashSet<String> set2 = new HashSet<>();
        set2.add("A");
        set2.add("B");
        set2.add("D");

        // Retain common elements
        set1.retainAll(set2);
        System.out.println("Common elements: " + set1);
    }
}
