package Queue; // Changed the package name to reflect Queue operations

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {
    public static void main(String... args) {
        // Creating a LinkedList implementation of Queue of Strings
        Queue<String> tasks = new LinkedList<>();
        System.out.println("Method 1");
        // Adding elements to the queue (enqueue)
        tasks.offer("Task A");
        tasks.offer("Task B");
        tasks.offer("Task C");
        System.out.println("Initial queue: " + tasks);
        System.out.println("____________________________________________________________________");

        System.out.println("Method 2");
        // Peeking at the element at the front of the queue (without removing)
        String nextTask = tasks.peek();
        System.out.println("Next task to process (peek): " + nextTask);
        System.out.println("Current queue after peek: " + tasks);
        System.out.println("____________________________________________________________________");


        System.out.println("Method 3");
        // Retrieving and removing the element at the front of the queue (dequeue)
        String processedTask1 = tasks.poll();
        System.out.println("Processed task (poll): " + processedTask1);
        System.out.println("Queue after first poll: " + tasks);
        System.out.println("____________________________________________________________________");

        System.out.println("Method 4");
        // Getting the size of the queue
        int size = tasks.size();
        System.out.println("Size of the queue: " + size);
        System.out.println("____________________________________________________________________");


        System.out.println("Method 5");
        // Checking if the queue is empty
        boolean isEmpty = tasks.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
        System.out.println("____________________________________________________________________");

        System.out.println("Method 6");
        // Adding more elements
        tasks.offer("Task D");
        tasks.offer("Task E");
        System.out.println("Queue after adding more tasks: " + tasks);
        System.out.println("____________________________________________________________________");

        System.out.println("Method 7");
        // Processing remaining elements
        System.out.println("Processing remaining tasks:");
        while (!tasks.isEmpty()) {
            String processedTask = tasks.poll();
            System.out.println("Processed task: " + processedTask);
        }
        System.out.println("Queue after processing all tasks: " + tasks);
        System.out.println("____________________________________________________________________");
    }
}