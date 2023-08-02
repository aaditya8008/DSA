import java.util.*;

public class mirrorbst2 {

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

    public static node mirror(node root) {
        if (root == null)
            return null;

        node left = mirror(root.left);
        node right = mirror(root.right);
        root.left = right;
        root.right = left;
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

        mirror(root);
        System.out.println("MIrror :");
        inorder(root);
    }

}