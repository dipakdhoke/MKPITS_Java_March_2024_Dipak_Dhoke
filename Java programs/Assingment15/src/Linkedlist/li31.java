package Linkedlist;

import java.util.LinkedList;

public class li31 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("D");

        // Insert elements at index 1
        list.add(1, "B");
        list.add(2, "C");
        System.out.println("Updated List: " + list);
    }
}
