package Priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        Comparator comparator=Comparator.reverseOrder();
        PriorityQueue priorityQueue=new PriorityQueue<>(comparator);
        priorityQueue.add(58);
        priorityQueue.add(99);
        priorityQueue.add(100);
        priorityQueue.add(89);
        priorityQueue.add(99);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);


    }
}
