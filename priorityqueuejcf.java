import java.util.*;

public class priorityqueuejcf {
    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(1);
        pq.add(0);
        pq.add(4);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

    }

}