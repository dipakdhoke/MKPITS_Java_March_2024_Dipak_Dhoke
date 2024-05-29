package Linkedlist;

import java.util.LinkedList;

public class li43 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Retrieve last element
        String lastElement = list.peekLast();
        System.out.println("Last Element: " + lastElement);
        System.out.println("Updated List: " + list);
    }
}
