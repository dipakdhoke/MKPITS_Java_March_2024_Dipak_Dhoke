package Linkedlist;

import java.util.LinkedList;

public class li30 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");

        // Insert at end
        list.addLast("B");
        System.out.println("Updated List: " + list);
    }

}
