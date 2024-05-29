package Linkedlist;

import java.util.LinkedList;

public class li28 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("B");

        // Insert at first and last positions
        list.addFirst("A");
        list.addLast("C");
        System.out.println("Updated List: " + list);
    }
}
