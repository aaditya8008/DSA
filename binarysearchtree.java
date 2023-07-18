import java.util.*;

public class binarysearchtree {

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

    public static boolean binarysearch(node root, int key) {
        if (root == null) {

            return false;
        }

        if (root.data == key) {
            return true;
        }
        if (key < root.data)
            return binarysearch(root.left, key);
        else
            return binarysearch(root.right, key);

    }

    public static void main(String args[]) {
        node root = new node(4);
        root.left = new node(2);
        root.right = new node(5);
        root.left.left = new node(1);
        root.left.right = new node(3);
        root.right.right = new node(6);

        binarytree tree = new binarytree();

        int n = 5;
        System.out.println(binarysearch(root, 50));
    }

}