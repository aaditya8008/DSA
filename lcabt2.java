import java.util.*;

public class lcabt2 {

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

    static node lca(node root, int n1, int n2) {
        if (root == null)
            return null;
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        node left = lca(root.left, n1, n2);
        node right = lca(root.right, n1, n2);
        if (right == null)
            return left;
        if (left == null)
            return right;
        return root;
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

        n = root;
        int n1 = 4, n2 = 7;
        System.out.println(lca(n, n1, n2).data);
    }

}