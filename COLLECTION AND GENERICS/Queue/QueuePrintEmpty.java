package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePrintEmpty {
    public static void main(String[] args) {
        Queue<Integer> Q2 = new LinkedList<>();
        Q2.offer(1);
        Q2.offer(2);
        Q2.offer(4);
        Q2.offer(9);
        Q2.offer(10);

        if (Q2 != null) {
            for (Integer q22 : Q2) {
                System.out.println(q22);
            }
        }

    }
}
