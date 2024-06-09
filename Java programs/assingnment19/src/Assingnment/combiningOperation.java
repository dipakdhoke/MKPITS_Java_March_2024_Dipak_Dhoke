package Assingnment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class combiningOperation {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>(){{
            add(67);
            add(78);
            add(89);
            add(99);
            add(40);
        }};
        Stream<Integer> stream=list.stream();
        int sum=stream.filter(n->n%2==1).mapToInt(n->2*n).sum();
        System.out.println(sum);
    }
}
