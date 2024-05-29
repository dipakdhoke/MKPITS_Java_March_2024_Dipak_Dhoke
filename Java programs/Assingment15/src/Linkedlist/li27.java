package Linkedlist;

import java.util.LinkedList;

public class li27 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("D");

        // Insert element at index 2
        list.add(2, "C");
        System.out.println("Updated List: " + list);
    }

}
