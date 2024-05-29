package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist12 {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList<>();
        arrayList.add(67);
        arrayList.add(56);
        arrayList.add(88);
        arrayList.add(45);
        arrayList.add(73);
        arrayList.subList(1,3);
        System.out.println(arrayList);
    }
}
