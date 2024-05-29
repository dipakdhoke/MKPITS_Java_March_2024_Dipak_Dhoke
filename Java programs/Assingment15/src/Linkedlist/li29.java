package Linkedlist;

import java.util.LinkedList;

public class li29 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("B");

        // Insert at front
        list.addFirst("A");
        System.out.println("Updated List: " + list);
    }
}
