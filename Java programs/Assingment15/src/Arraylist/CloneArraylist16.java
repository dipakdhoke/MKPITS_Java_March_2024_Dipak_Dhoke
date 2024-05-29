package Arraylist;

import java.util.ArrayList;

public class CloneArraylist16 {


        public static void main(String[] args) {
            ArrayList<String> originalList = new ArrayList<>();
            originalList.add("A");
            originalList.add("B");
            originalList.add("C");

            // Clone list
            ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();
            System.out.println("Cloned List: " + clonedList);
        }
}
