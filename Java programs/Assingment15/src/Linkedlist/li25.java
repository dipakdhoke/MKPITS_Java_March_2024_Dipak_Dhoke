package Linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class li25 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // Start iterating from index 2
        ListIterator<String> iterator = list.listIterator(2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
