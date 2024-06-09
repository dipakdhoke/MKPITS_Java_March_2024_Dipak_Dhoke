package Assingnment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Mapping {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>(){{
           add(67);
            add(78);
            add(89);
            add(99);
            add(40);
        }};
        Stream<Integer> stream=list.stream();
        stream.map(n->n=n*2).forEach(n-> System.out.println(n));
        Stream<Integer> stream1=list.stream();
        stream1.map(n->n=n*2).forEach(System.out::println);
    }
}
