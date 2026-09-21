import java.util.*;

public class PriorityQueueBasics {

    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(90);
        pq.offer(60);
        pq.offer(80);
        pq.offer(120);

        // poll() -> removes and returns the highest-priority element
        // In default PriorityQueue, the smallest value has the highest priority
        System.out.println(pq.poll());
    }
}
