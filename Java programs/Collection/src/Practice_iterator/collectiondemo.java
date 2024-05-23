package Practice_iterator;

import java.util.*;

public class collectiondemo {
    public static void main(String[] args) {
        //initialising List using List returned by aslist method of Arrays class
        List<Integer> list = Arrays.asList(56, 44, 65, 33, 45, 67);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // passing another collection to constructer of Arraylist
        ArrayList<Integer> arrayList = new ArrayList<>(list);
        System.out.println(arrayList);
        //initialising ArrayList using double braces(anonymous inner class)
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>() {{
            add(22);
            add(66);
            add(88);
            add(99);
        }};
        System.out.println(arrayList1);
        List<Integer> list1 = Arrays.asList(89, 99, 99, 87, 56);
        System.out.println(list1);
        Set<Integer> set = new HashSet<>(list1);
        System.out.println(set);
        Collections.sort(list);
        ArrayList<Student> studentarrayList2 = new ArrayList<Student>()
        {{
            add(new Student("john",78));
            add(new Student("aspak",93));
            add(new Student("mark",89));

        }};
        Collections.sort(studentarrayList2,new Comparatorname());
        Collections.sort(studentarrayList2,new Comparatormarks());

        System.out.println(studentarrayList2);

    }


    }

