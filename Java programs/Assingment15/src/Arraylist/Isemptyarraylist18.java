package Arraylist;

import java.util.ArrayList;

public class Isemptyarraylist18 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Test if list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        list.add("A");
        isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
    }
}
