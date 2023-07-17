import java.util.*;

public class mindistance2node {

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

    public static int lcadist(node root, int n) {

        if (root == null)
            return -1;
        if (root.data == n)
            return 0;
        int left = lcadist(root.left, n);
        int right = lcadist(root.right, n);
        if (left == -1 && right == -1)
            return -1;
        else if (left == -1) {
            return right + 1;
        } else {
            return left + 1;
        }

    }

    public static int mindist(node root, int n1, int n2) {
        node lca = lca(root, n1, n2);
        int dist1 = lcadist(lca, n1);
        int dist2 = lcadist(lca, n2);
        return dist1 + dist2;

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
        System.out.println(mindist(root, n1, n2));
    }

}