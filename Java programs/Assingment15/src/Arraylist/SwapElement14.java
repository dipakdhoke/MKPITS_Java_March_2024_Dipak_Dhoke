package Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SwapElement14 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // Swap elements
        Collections.swap(list, 1, 3);
        System.out.println("List after swapping: " + list);
    }
}
