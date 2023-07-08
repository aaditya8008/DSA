
import java.lang.String;
import java.util.*;

import org.w3c.dom.Node;

class mergesortll {
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

    public static node getMid(node head) {
        node slow = head;
        node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        System.out.println("MID:" + slow.data);
        return slow;

    }

    public node merge(node head1, node head2) {
        node mergeLL = new node(-1);
        node temp = mergeLL;
        while (head1 != null & head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;

    }

    public node mergeSort(node head) {
        if (head == null || head.next == null) {
            return head;
        }
        node mid = getMid(head);
        node rightHead = mid.next;
        mid.next = null;
        node newLeft = mergeSort(head);
        node newRight = mergeSort(rightHead);
        return merge(newLeft, newRight);

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
        mergesortll list = new mergesortll();
        System.out.println("Enter Size :\n");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter Data :\n");
        for (int i = 0; i < size; i++) {
            list.lastadd(sc.nextInt());
        }
        list.print();
        list.head = list.mergeSort(list.head);
        list.print();
    }

}