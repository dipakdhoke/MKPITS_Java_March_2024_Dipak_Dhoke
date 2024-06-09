package Assingnment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filterandcollecting {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>(){{
            add("Ajmer");
            add("Pune");
            add("Agra");
            add("Nagpur");
            add("Amravati");
        }};
        List<String> list1=list.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
        System.out.println(list1);
    }


}
