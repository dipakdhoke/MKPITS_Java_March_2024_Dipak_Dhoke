package Assingnment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Groupingandcounting {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>(){{
            add("Ajmer");
            add("Pune");
            add("Agra");
            add("Nagpur");
            add("Amravati");
        }};
        Stream<String> stream=list.stream();
        Map <Integer,Long> groupbylength= stream.collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println(groupbylength);
    }
}
