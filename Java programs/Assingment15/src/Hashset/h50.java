package Hashset;

import java.util.HashSet;

public class h50 {

        public static void main(String[] args) {
            HashSet<String> set = new HashSet<>();
            set.add("A");
            set.add("B");
            set.add("C");

            for (String element : set) {
                System.out.println(element);
            }
        }
    }
