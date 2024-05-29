package Arraylist;

import java.util.ArrayList;

public class Replacesecondelement21 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Replace second element
        list.set(1, "Z");
        System.out.println("Updated List: " + list);
    }
}
