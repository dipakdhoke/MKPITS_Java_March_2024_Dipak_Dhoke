package Linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class li37 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Swap elements at index 0 and 2
        Collections.swap(list, 0, 2);
        System.out.println("Updated List: " + list);
    }
}
