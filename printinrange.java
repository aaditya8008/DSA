import java.util.*;

public class printinrange {

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

    public static node previous(node root) {

        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root;

    }

    public static node next(node root) {

        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root;

    }

    public static void printinrange(node root, int n1, int n2) {
        if (root == null)
            return;
        if (root.data >= n1 && root.data <= n2) {
            printinrange(root.left, n1, n2);
            System.out.println(root.data);
            printinrange(root.right, n1, n2);
        } else if (root.data < n1) {
            printinrange(root.left, n1, n2);

        } else {
            printinrange(root.right, n1, n2);

        }

    }

    public static void inorder(node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }

    public static void main(String args[]) {
        node root = new node(4);
        root.left = new node(2);
        root.right = new node(5);
        root.left.left = new node(1);
        root.left.right = new node(3);
        root.right.right = new node(6);

        binarytree tree = new binarytree();
        node n = root;
        inorder(n);

        n = root;
        System.out.println("In Range :");
        printinrange(n, 1, 4);
    }

}