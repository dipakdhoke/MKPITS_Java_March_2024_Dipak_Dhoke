package Linkedlist;

import java.util.LinkedList;

public class li36 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Remove all elements
        list.clear();
        System.out.println("Updated List: " + list);
    }
}
