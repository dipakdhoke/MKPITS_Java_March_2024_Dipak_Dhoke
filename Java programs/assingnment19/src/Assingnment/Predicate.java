package Assingnment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Predicate {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>(){{
            add(67);
            add(9);
            add(89);
            add(99);
            add(40);
        }};
        Stream<Integer> stream=list.stream();
        stream.filter(n->n>10).forEach(n-> System.out.println(n));
    }
}
