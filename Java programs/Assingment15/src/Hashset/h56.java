package Hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class h56 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        // Convert to TreeSet
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("TreeSet: " + treeSet);
    }
}
