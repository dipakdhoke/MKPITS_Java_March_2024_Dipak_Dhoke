package Arraylist;

import java.util.ArrayList;

public class Arraylist4 {
//Write a Java program to retrieve an element (at a specified index) from a given array list.
public static void main(String[] args) {
    ArrayList retrieve =new ArrayList();
    retrieve.add(76);
    retrieve.add(58);
    retrieve.add(45);
    retrieve.add(89);
    retrieve.add(39);

    System.out.println(retrieve.get(4));
}
}
