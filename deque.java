import java.util.*;

public class deque {
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

        public static void addend(int data) {
            node newnode = new node(data);
            if (rear == null && front == null) {
                rear = front = newnode;

            } else {
                rear.next = newnode;
                rear = newnode;
            }

        }

        public static void addfirst(int data) {
            node newnode = new node(data);
            if (rear == null && front == null) {
                rear = front = newnode;

            } else {
                newnode.next = front;
                front = newnode;
            }

        }

        public static int remfirst() {
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

        public static int remlast() {
            int x = rear.data;
            if (rear == null && front == null) {
                return -1;
            }
            if (rear == front) {
                front = front.next;
                front = null;
                rear = null;

            } else {
                node n = front;
                while (n.next != rear) {
                    n = n.next;
                }
                rear = n;
                rear.next = null;
            }
            return x;

        }

        public static int speek() {
            if (front != null && rear != null) {
                return front.data;

            }
            return -1;

        }

        public static int epeek() {
            if (front != null && rear != null) {
                return rear.data;

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
            q.addend(sc.nextInt());

        }
        q.print();
        System.out.println("Removed last:" + q.remlast());
        q.print();
        System.out.println("Removed first:" + q.remfirst());
        q.print();
        System.out.println("Added last:");
        q.addend(5);
        q.print();
        System.out.println("Added first:");
        q.addfirst(1);
        q.print();

    }

}