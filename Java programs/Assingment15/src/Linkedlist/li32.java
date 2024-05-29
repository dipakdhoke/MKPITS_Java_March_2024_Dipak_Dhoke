package Linkedlist;

import java.util.LinkedList;

public class li32 {
    public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("B");

    System.out.println("First occurrence of 'B': " + list.indexOf("B"));
    System.out.println("Last occurrence of 'B': " + list.lastIndexOf("B"));
}
}
