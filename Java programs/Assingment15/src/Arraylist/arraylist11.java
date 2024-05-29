package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist11 {
//    Write a Java program to reverse elements in an array list
public static void main(String[] args) {
    ArrayList arrayList=new ArrayList<>();
    arrayList.add(67);
    arrayList.add(56);
    arrayList.add(88);
    arrayList.add(45);
    arrayList.add(73);
    Collections.reverse(arrayList);
    System.out.println(arrayList);
}
}
