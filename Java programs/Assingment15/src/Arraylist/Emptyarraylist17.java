package Arraylist;

import java.util.ArrayList;

public class Emptyarraylist17 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Empty the list
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}
