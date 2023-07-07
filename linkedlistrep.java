import java.util.*;

public class linkedlistrep {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public node head;
    public node tail;

    void firstadd(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

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

    void print(int size) {
        System.out.println("Data :\n");
        node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String args[]) {
        linkedlistrep newer = new linkedlistrep();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size :\n");
        int size = sc.nextInt();
        System.out.println("Enter data :\n");
        for (int i = 0; i < size; i++)
            newer.lastadd(sc.nextInt());
        newer.print(size);

    }
}