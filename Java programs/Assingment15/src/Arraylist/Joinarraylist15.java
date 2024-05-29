package Arraylist;

import java.util.ArrayList;

public class Joinarraylist15 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("C");
        list2.add("D");

        // Join lists
        ArrayList<String> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);
        System.out.println("Joined List: " + joinedList);
    }

}
