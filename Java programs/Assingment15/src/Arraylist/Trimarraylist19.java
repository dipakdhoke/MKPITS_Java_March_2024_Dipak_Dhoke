package Arraylist;

import java.util.ArrayList;

public class Trimarraylist19 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(100);
        list.add("A");
        list.add("B");
        list.add("C");

        // Trim the capacity to the current size
        list.trimToSize();
        System.out.println("List after trimming: " + list);
    }
}
