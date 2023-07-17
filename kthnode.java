import java.util.*;

public class kthnode {

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

        static void prefix(node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.data);
            prefix(root.left);
            prefix(root.right);

        }

        static void kthroot(node root, int k, int level) {
            if (root == null) {
                System.out.println("Not Found");
                return;
            }

            if (level == k) {
                System.out.println("Found");
                System.out.println(root.data);
                return;
            }

            kthroot(root.left, k, level + 1);
            kthroot(root.right, k, level + 1);

        }

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
        node n = root;
        tree.prefix(n);
        n = root;
        tree.kthroot(root, 2, 1);
    }

}