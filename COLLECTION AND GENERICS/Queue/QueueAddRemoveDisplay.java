package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAddRemoveDisplay {
    public static void main(String... args) {
        Queue<String> Q1 = new LinkedList<String>();
            Q1.add("Car");
            Q1.add("Bike");
            Q1.add("Truck");
            Q1.add("Aeroplane");
            System.out.println(Q1.toString());
            Q1.poll();
            for (String q12 : Q1) {
                System.out.println(q12);
            }
            System.out.println("_____________Printing elements after removing the first one(FIFO)_______________________________");
            Q1.poll();
            System.out.println(" ");
            System.out.println("Printing first element " + Q1.peek());
            System.out.println(" ");
            System.out.println("___________________________________________________________");
            System.out.println(Q1.toString());
        
    }
}
