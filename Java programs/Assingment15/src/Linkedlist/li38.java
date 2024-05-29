package Linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class li38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Shuffle elements
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);
    }
}
