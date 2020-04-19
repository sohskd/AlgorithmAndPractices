package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class testPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue queue = new PriorityQueue(Collections.reverseOrder());

        queue.add(12);
        queue.add(14);
        queue.add(9);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        Queue queue1 = new LinkedList();
        queue1.add(12);
        queue1.add(14);
        queue1.add(9);

        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
    }
}
