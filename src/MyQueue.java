import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Bro");
        queue.offer("ForReal");
        queue.poll();
        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.contains("Bro"));
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
