package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        System.out.println(arrayList.isEmpty());
        arrayList.add(10);
        arrayList.add(30);
        arrayList.add(56);
        arrayList.add("dipak");
        arrayList.add(90.5);
//        System.out.println(arrayList.remove( 3));

//        for(int i=0;i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }
//        for(Object o:arrayList){
//            System.out.println(o);
//        }
        System.out.println(arrayList.get(3).toString().toUpperCase());
        LinkedList<Integer> linkedList=new <Integer>LinkedList();
        linkedList.add(10);
        linkedList.add(44);
        linkedList.add(67);
        linkedList.add((89));
        for(Object o:linkedList){
            System.out.println(o);
        }
        Iterator iterator=arrayList.iterator();
        iterator.next();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(arrayList);
        LinkedList linkedList1=new LinkedList();
        linkedList1.add(33);
        linkedList1.add(78);
        linkedList1.add("devesh");
        linkedList.addAll(linkedList1);
        System.out.println(linkedList);
    }



}
