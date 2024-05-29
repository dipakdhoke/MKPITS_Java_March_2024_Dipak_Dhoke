package Linkedlist;

import java.util.LinkedList;

public class li42 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Retrieve first element
        String firstElement = list.peek();
        System.out.println("First Element: " + firstElement);
        System.out.println("Updated List: " + list);
    }
}
