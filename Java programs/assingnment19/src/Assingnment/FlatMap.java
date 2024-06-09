package Assingnment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> listoflist=new ArrayList<>();
        listoflist.add(Arrays.asList(89,99,67,45));
        listoflist.add(Arrays.asList(56,88,69,40));
        listoflist.add(Arrays.asList(77,96,79,46,54));
        System.out.println(listoflist);
        List <Integer> list=listoflist.stream().flatMap(List::stream).collect(Collectors.toList());
        List <Integer> list1=listoflist.stream().flatMap(l->l.stream()).collect(Collectors.toList());
        int ss=listoflist.stream().flatMap(List::stream).mapToInt(i->i).sum();
        System.out.println(list);
        System.out.println(ss);
    }
}
