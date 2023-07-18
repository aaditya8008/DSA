import java.util.*;

public class kthancestor {

    static class node {
        int data;
        node right;
        node left;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binarytree {
        static int idx = -1;

        static node buildnode(int nodes[]) {
            idx++;
            node newnode = new node(nodes[idx]);
            newnode.left = buildnode(nodes);
            newnode.right = buildnode(nodes);
            return newnode;
        }

    }

    public static int kancestor(node root, int n, int k) {

        if (root == null)
            return -1;
        if (root.data == n)
            return 0;
        int left = kancestor(root.left, n, k);
        int right = kancestor(root.right, n, k);
        if (left == -1 && right == -1)
            return -1;
        int max = Math.max(left, right);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;

    }

    public static void main(String args[]) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);

        binarytree tree = new binarytree();

        int n = 5;
        kancestor(root, n, 2);
    }

}