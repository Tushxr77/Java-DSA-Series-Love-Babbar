import java.util.*;

public class QueueBasics {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        //Adding
        q.offer(10);
        q.offer(20);
        q.offer(60);
        q.offer(80);

        System.out.println(q);
        //Remove
        q.poll();
        System.out.println(q);

        //Peek--> Checking the front element
        System.out.println(q.peek());
    }
}
