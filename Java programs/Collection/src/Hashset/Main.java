package Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set <Integer>set=new HashSet<Integer>();
        set.add(33);
        set.add(78);
        set.add(89);
        set.add(34);
        Set<Integer>set1=new HashSet<Integer>();
        set1.add(55);
        set1.add(78);
        set1.add(89);
        set1.add(99);
        Set<Integer> union=new HashSet<Integer>(set);
        union.addAll(set1);
        System.out.println(union);

        Set<Integer> intersectionSet = new HashSet<Integer>(set);
        intersectionSet.retainAll(set1);
        System.out.println("Intersection of Set1 and Set2: " + intersectionSet);
        set.removeAll(set1);
        System.out.println(set);
        set.remove(13);
        System.out.println(set.contains(33));
        System.out.println(set);
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() );
        }

    }
}
