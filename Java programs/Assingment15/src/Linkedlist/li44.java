package Linkedlist;

import java.util.LinkedList;

public class li44 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Check if element exists
        boolean exists = list.contains("B");
        System.out.println("Does 'B' exist in the list? " + exists);
    }
}
