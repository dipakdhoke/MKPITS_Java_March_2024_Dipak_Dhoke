package Arraylist;

import java.util.ArrayList;

public class arraylist7 {
//     Write a Java program to search for an element in an array list.
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList<>();
        arrayList.add(67);
        arrayList.add(56);
        arrayList.add(88);
        arrayList.add(45);
        arrayList.add(73);
        arrayList.set(3,88);
        System.out.println(arrayList.contains(67 ));
    }
}
