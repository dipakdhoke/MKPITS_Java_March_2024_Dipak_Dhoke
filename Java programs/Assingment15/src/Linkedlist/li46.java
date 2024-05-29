package Linkedlist;

import java.util.LinkedList;

public class li46 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");

        // Compare lists
        boolean areEqual = list1.equals(list2);
        System.out.println("Are the lists equal? " + areEqual);
    }
}
