
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class myPriority {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
