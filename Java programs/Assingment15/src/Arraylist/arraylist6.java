package Arraylist;

import java.util.ArrayList;

public class arraylist6 {
//    Write a Java program to remove the third element from an array list.
    public static void main(String[] args) {
        ArrayList removethird= new ArrayList<>();
        removethird.add(67);
        removethird.add(56);
        removethird.add(88);
        removethird.add(45);
        removethird.add(73);
        removethird.remove(3) ;
        System.out.println(removethird);
    }
}
