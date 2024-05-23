package Linkedlist;

import java.util.*;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        List<Integer> list=new LinkedList<Integer>();
        Queue<Integer> queue=new LinkedList<Integer>();
        linkedList.add(44);
        linkedList.add(22);
        linkedList.add(34);
        linkedList.add(45);
        linkedList.offer(22);
//        System.out.println(linkedList.getFirst()+"   ....");


//        Iterator it =linkedList.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }


        list.add(55);
        list.add(46);
        list.add(88);
        list.add(78);
        list.add(2,399);

//        Iterator it1 =list.iterator();
//        while (it1.hasNext()){
//            System.out.println(it1.next());
//        }
       queue.add(56);
        queue.add(90);
        queue.add(89);
        queue.add(49);

//        Iterator it2 =queue.iterator();
//        while (it2.hasNext()){
//            System.out.println(it2.next());
//        }


        ListIterator  iterator=linkedList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        Spliterator spliterator=linkedList.spliterator();


    }

}
