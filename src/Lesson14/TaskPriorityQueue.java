package Lesson14;

import java.util.PriorityQueue;

public class TaskPriorityQueue {
    public static void main(String[] args) {

        //1
        PriorityQueue<String> priority_queue = new PriorityQueue<>();
        priority_queue.add("Pink");
        priority_queue.add("Grey");
        priority_queue.add("White");
        System.out.println(priority_queue);

        //2
        for (String element : priority_queue ){
            System.out.println(element);
        }
    }
}
