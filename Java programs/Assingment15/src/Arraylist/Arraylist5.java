package Arraylist;

import java.util.ArrayList;

public class Arraylist5 {
//     Write a Java program to update an array element by the given element
public static void main(String[] args) {
    ArrayList arrayList=new ArrayList<>();
    arrayList.add(67);
    arrayList.add(56);
    arrayList.add(88);
    arrayList.add(45);
    arrayList.add(73);
    arrayList.set(3,88);
    System.out.println(arrayList);
}
}
