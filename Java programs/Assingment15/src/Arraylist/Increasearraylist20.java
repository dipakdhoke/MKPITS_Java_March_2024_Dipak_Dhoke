package Arraylist;

import java.util.ArrayList;

public class Increasearraylist20 {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("A");
            list.add("B");

            // Ensure capacity
            list.ensureCapacity(10);
            System.out.println("List after ensuring capacity: " + list);
        }
}
