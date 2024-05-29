package Hashset;

import java.util.HashSet;

public class h53 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Check if set is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is the set empty? " + isEmpty);

        set.add("A");
        isEmpty = set.isEmpty();
        System.out.println("Is the set empty? " + isEmpty);
    }
}
