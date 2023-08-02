import java.util.*;

public class avl {

    static class node {

        int data, height;
        node left, right;

        node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static node root;

    public static int height(node root) {
        if (root == null)
            return 0;
        return root.height;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static node rightrotate(node y) {
        node x = y.left;
        node t2 = x.right;
        x.right = y;
        y.left = t2;
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
        return x;

    }

    public static node leftrotate(node x) {
        node y = x.right;
        node t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
        return y;
    }

    public static int getbalance(node root) {
        if (root == null)
            return 0;
        return height(root.left) - height(root.right);
    }

    public static node insert(node root, int key) {
        if (root == null)
            return new node(key);
        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int bf = getbalance(root);

        if (bf > 1 && key < root.left.data)
            return rightrotate(root);
        if (bf < -1 && key > root.right.data)
            return leftrotate(root);
        if (bf > 1 && key > root.left.data) {
            root.left = leftrotate(root.left);
            return rightrotate(root);
        }
        if (bf < -1 && key < root.right.data) {
            root.right = rightrotate(root.right);
            return leftrotate(root);
        }
        return root;
    }

    public static void preorder(node root) {
        if (root == null)
            return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        preorder(root);
    }
}