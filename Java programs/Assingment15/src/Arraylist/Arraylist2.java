package Arraylist;

import java.util.ArrayList;

public class Arraylist2 {
//    Write a Java program to iterate through all elements in an array list
public static void main(String[] args) {
    ArrayList arrayList=new ArrayList<>();
    arrayList.add(55);
    arrayList.add(67);
    arrayList.add(88);
    arrayList.add(99);
    arrayList.add(45);

    for (Object array:arrayList){
        System.out.println(array);
    }


}
}
