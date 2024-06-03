package Arraydeque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;

public class QueueReconstructionByHeight {

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        LinkedList<int[]> result = new LinkedList<>();
        for (int[] person : people) {
            result.add(person[1], person);
        }

        return result.toArray(new int[people.length][]);
    }

    public static void main(String[] args) {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] reconstructedQueue = reconstructQueue(people);

        System.out.println("Reconstructed queue: ");
        for (int[] person : reconstructedQueue) {
            System.out.println(Arrays.toString(person));
        }
    }
}
