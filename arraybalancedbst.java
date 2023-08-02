import java.util.*;

public class arraybalancedbst {

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

    public static node createtree(int arr[], int s, int e) {
        if (s > e)
            return null;

        int mid = (s + e) / 2;
        node root = new node(arr[mid]);
        root.left = createtree(arr, s, mid - 1);
        root.right = createtree(arr, mid + 1, e);

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
        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

        node root = createtree(arr, 0, arr.length - 1);
        inorder(root);

    }

}