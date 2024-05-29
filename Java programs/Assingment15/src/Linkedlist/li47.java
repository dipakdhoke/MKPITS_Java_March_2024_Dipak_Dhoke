package Linkedlist;

import java.util.LinkedList;

public class li47 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Check if list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        list.add("A");
        isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
    }
}
