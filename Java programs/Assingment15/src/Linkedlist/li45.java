package Linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class li45 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        // Convert to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(linkedList);
        System.out.println("ArrayList: " + arrayList);
    }
}
