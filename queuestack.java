import java.util.*;

public class queuestack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            } else {
                return s1.pop();

            }

        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            return s1.peek();
        }

    }

    public static void main(String args[]) {
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size :");
        int size = sc.nextInt();

        System.out.println("Enter Data :");
        for (int i = 0; i < size; i++) {
            q.add(sc.nextInt());
        }

        Queue n = q;
        while (!n.isEmpty()) {
            System.out.println(n.peek());
            n.remove();

        }

        System.out.println(q.s1);
        System.out.println(q.remove());

    }

}