package Arraylist;

import java.util.ArrayList;

public class Arraylist3 {
//     Write a Java program to insert an element into the array list at the first position
public static void main(String[] args) {
    ArrayList insert =new ArrayList();
    insert.add(76);
    insert.add(58);
    insert.add(45);
    insert.add(89);
    insert.add(39);
    insert.add(0,56);
    System.out.println(insert);
}
}
