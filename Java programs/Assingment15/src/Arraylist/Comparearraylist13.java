package Arraylist;

import java.util.ArrayList;

public class Comparearraylist13 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("D");

        // Compare lists
        boolean areEqual = list1.equals(list2);
        System.out.println("Are the lists equal? " + areEqual);
    }
}
