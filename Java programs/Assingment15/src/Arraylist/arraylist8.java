package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist8 {
//Write a Java program to sort a given array list
public static void main(String[] args) {
    ArrayList arrayList=new ArrayList<>();
    arrayList.add(67);

    arrayList.add(56);
    arrayList.add(88);
    arrayList.add(45);
    arrayList.add(73);
    arrayList.set(3,88);
    Collections.sort(arrayList);
    System.out.println(arrayList);
}

}
