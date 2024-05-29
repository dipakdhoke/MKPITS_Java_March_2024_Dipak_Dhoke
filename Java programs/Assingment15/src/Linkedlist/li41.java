package Linkedlist;

import java.util.LinkedList;

public class li41 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Remove and return first element
        String firstElement = list.poll();
        System.out.println("Removed Element: " + firstElement);
        System.out.println("Updated List: " + list);
    }
}
