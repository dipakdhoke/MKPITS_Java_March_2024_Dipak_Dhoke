package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist10 {
//    Write a Java program to shuffle elements in an array list
public static void main(String[] args) {
    ArrayList arrayList=new ArrayList<>();
    arrayList.add(67);
    arrayList.add(56);
    arrayList.add(88);
    arrayList.add(45);
    arrayList.add(73);
    Collections.shuffle(arrayList);
    System.out.println(arrayList);
}
}
