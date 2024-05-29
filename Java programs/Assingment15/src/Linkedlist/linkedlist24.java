package Linkedlist;

import java.util.LinkedList;

public class linkedlist24 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String element : list) {
            System.out.println(element);
        }
    }
}
