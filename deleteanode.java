import java.util.*;

public class deleteanode {

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

    public static node deleteanode(node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null)
            return null;
        else if (key < root.data)
            root.left = deleteanode(root.left, key);
        else if (key > root.data)
            root.right = deleteanode(root.right, key);
        else {
            if (root.left != null) {
                node n = previous(root);
                root.data = n.data;
                n.left = deleteanode(root.left, n.data);
            } else if (root.right != null) {
                node n = next(root);
                root.data = n.data;
                n.right = deleteanode(root.right, n.data);
            }

        }
        return root;

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
        deleteanode(n, 4);
        n = root;
        inorder(n);
    }

}