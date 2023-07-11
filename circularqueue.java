import java.util.*;

public class circularqueue {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            if (rear == -1 && front == -1)
                return true;
            return false;
        }

        public static boolean isFull() {
            if ((rear + 1) % arr.length == front)
                return true;
            return false;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Full");
                return;
            } else if (isEmpty()) {
                rear = (rear + 1) % arr.length;
                front = (front + 1) % arr.length;
                arr[rear] = data;
            } else {
                rear = (rear + 1) % arr.length;
                arr[rear] = data;
            }

        }

        public static int rem() {
            if (rear == front) {
                rear = front = -1;

            }

            if (!isEmpty()) {
                int x = arr[front];

                front = (front + 1) % arr.length;
                return x;

            } else {
                System.out.println("Empty");
                return -1;
            }

        }

        public static void print() {
            int x = front;
            System.out.println("Data :\n");
            for (int i = 0; i < arr.length; i = (i + 1)) {
                System.out.println(arr[i]);
            }

        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;

            }
            return arr[front];

        }

    }

    public static void main(String args[]) {
        System.out.println("Enter Size :\n");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Queue q = new Queue(size);
        System.out.println("Enter Data :\n");
        for (int i = 0; i < size; i++) {
            q.add(sc.nextInt());
        }
        q.print();
        q.rem();
        System.out.println("Removed :\n");
        q.print();
        q.add(10);
        q.print();
        q.print();
        q.rem();
        System.out.println("Removed :\n");
        q.add(11);
        q.print();
    }

}
