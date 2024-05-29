package Linkedlist;

import java.util.LinkedList;

public class li34 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Remove element
        list.remove("B");
        System.out.println("Updated List: " + list);
    }
}
