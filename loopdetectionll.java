import java.util.*;

class loopdetectionll {
    public static class node {
        int data;
        node next;

        node(int data) {
            count++;
            this.data = data;
            this.next = null;
        }
    }

    static node head;
    static node tail;
    static int count = 0;

    void lastadd(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;

        }

    }

    public static void makingloop(int data) {
        node n = head;
        while (n.data != data) {
            n = n.next;
        }
        tail.next = n;
         System.out.println("Loop at :" + n.data);
    }

    public static void loopdetection() {
        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println("Loop detected at :" + slow.data);
                return;
            }
        }
        System.out.println("No Loop detected ");
        return;

    }

    public static void print() {
        node n = head;
        System.out.println("Data :");
        while (n != null) {
            System.out.println(n.data);
            n = n.next;

        }

    }

    public static void main(String args[]) {
        loopdetectionll list = new loopdetectionll();
        System.out.println("Enter Size :\n");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter Data :\n");
        for (int i = 0; i < size; i++) {
            list.lastadd(sc.nextInt());
        }
        list.print();
        System.out.println("Enter node data to make loop :");
        list.makingloop(sc.nextInt());
        list.loopdetection();
    }

}