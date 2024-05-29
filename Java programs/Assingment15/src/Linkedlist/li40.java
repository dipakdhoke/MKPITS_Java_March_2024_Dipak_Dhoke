package Linkedlist;

import java.util.LinkedList;

public class li40 {
    public static void main(String[] args) {
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("A");
        originalList.add("B");
        originalList.add("C");

        // Copy list
        LinkedList<String> copiedList = new LinkedList<>(originalList);
        System.out.println("Copied List: " + copiedList);
    }

}
