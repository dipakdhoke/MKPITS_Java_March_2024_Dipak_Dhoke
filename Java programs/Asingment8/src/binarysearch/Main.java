package binarysearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; // Sorted array
        int target = 7;

        int index = binarysearch.binarysearch(array, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
