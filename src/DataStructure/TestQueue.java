package DataStructure;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

    public static void main(String[] args) {
        Queue queue = new LinkedList();

        queue.add(5);
        queue.add(6);

        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
