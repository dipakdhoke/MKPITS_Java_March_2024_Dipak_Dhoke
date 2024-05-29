package Linkedlist;

import java.util.LinkedList;

public class li35 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Remove first and last elements
        list.removeFirst();
        list.removeLast();
        System.out.println("Updated List: " + list);
    }
}
