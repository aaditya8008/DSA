import java.util.*;

class removeloopll {
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

    public static node loopdetection() {
        node slow = head;
        node fast = head;
        boolean permit = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println("Loop detected");
                permit = true;
                break;
            }
        }
        if (permit) {
            slow = head;
            while (slow != fast) {
                fast = fast.next;
                slow = slow.next;
            }
            System.out.println("Loop detected :" + slow.data);
            return slow;
        }

        else {
            System.out.println("No Loop detected ");
            return null;
        }

    }

    void removeloop() {
        node target = loopdetection();
        if (target == null) {
            return;
        }
        node n = target;
        while (n.next != target) {
            n = n.next;

        }
        tail = n;
        tail.next = null;
        System.out.println("Removed Loop ");
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
        removeloopll list = new removeloopll();
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
        list.removeloop();
        print();
    }

}