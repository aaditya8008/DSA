import java.util.*;

public class linkedlistqueue {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static node front;
        static node rear;

        public static void add(int data) {
            node newnode = new node(data);
            if (rear == null && front == null) {
                rear = front = newnode;

            } else {
                rear.next = newnode;
                rear = newnode;
            }

        }

        public static int rem() {
            int x = front.data;
            if (rear == null && front == null) {
                return -1;
            }
            if (rear == front) {
                front = front.next;
                front = null;
                rear = null;

            } else {
                front = front.next;

            }
            return x;

        }

        public static int peek() {
            if (front != null && rear != null) {
                return front.data;

            }
            return -1;

        }

        public static void print() {
            node n = front;
            System.out.println("Data :");
            while (n != null) {
                System.out.println(n.data);
                n = n.next;
            }

        }

    }

    public static void main(String args[]) {
        Queue q = new Queue();
        System.out.println("Enter Size :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter Data:");
        for (int i = 0; i < size; i++) {
            q.add(sc.nextInt());

        }
        q.print();
        System.out.println("Removed :" + q.rem());
        q.print();
        q.peek();

    }

}