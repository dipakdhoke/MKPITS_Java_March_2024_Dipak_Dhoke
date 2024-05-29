package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist9 {
//Write a Java program to copy one array list into another
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList<>();
        arrayList.add(67);
        arrayList.add(56);
        arrayList.add(88);
        arrayList.add(45);
        arrayList.add(73);
        ArrayList<Integer> arrayList1=new ArrayList<Integer>(arrayList);
        System.out.println(arrayList1);
    }
}
