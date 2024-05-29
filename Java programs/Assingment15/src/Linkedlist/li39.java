package Linkedlist;

import java.util.LinkedList;

public class li39 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("C");
        list2.add("D");

        // Join lists
        LinkedList<String> joinedList = new LinkedList<>(list1);
        joinedList.addAll(list2);
        System.out.println("Joined List: " + joinedList);
    }
}
