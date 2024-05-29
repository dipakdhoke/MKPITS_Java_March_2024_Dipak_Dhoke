package Linkedlist;

import java.util.LinkedList;

public class li48 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Replace element at index 1
        list.set(1, "Z");
        System.out.println("Updated List: " + list);
    }
}
