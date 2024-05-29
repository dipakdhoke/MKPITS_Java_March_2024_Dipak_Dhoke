package Linkedlist;

import java.util.LinkedList;

public class linkedlist23 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");

        // Append element
        list.add("C");
        System.out.println("Updated List: " + list);
    }
}
