package Assingnment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>(){{
            add("Ajmer");
            add("Pune");
            add("Agra");
            add("Nagpur");
            add("Amravati");
        }};
        Stream<String> stream=list.stream();
        List list1=stream.sorted().collect(Collectors.toList());
        System.out.println(list1);
    }
}
