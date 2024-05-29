package Hashset;

import java.util.TreeSet;

public class h57 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(7);
        set.add(5);
        set.add(9);

        // Find numbers less than 7
        TreeSet<Integer> headSet = (TreeSet<Integer>) set.headSet(7);
        System.out.println("Numbers less than 7: " + headSet);
    }

}
