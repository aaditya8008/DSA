import java.util.*;

public class diametertree {

    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            node left = null;
            node right = null;
        }
    }

    static class binarytrees {
        static int idx = -1;
        int left;
        int right;

        public static node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            node newnode = new node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;
        }

        public static int height(node root) {
            node n = root;
            if (n == null) {
                return 0;
            }
            int left = height(n.left);
            int right = height(n.right);

            return Math.max(left, right) + 1;
        }

        public static int diameter(node root) {
            if (root == null) {
                return 0;
            }
            int lheight = height(root.left);
            int leftdia = diameter(root.left);
            int rightdia = diameter(root.right);
            int rheight = height(root.right);

            int self = lheight + rheight + 1;
            return Math.max(self, Math.max(leftdia, rightdia));

        }

        public static void levelorder(node n) {

            if (n == null) {
                return;
            }
            Queue<node> q = new LinkedList<>();
            q.add(n);
            q.add(null);
            while (!q.isEmpty()) {
                node currnode = q.remove();
                if (currnode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);

                    }

                } else {
                    System.out.print(currnode.data + " ");
                    if (currnode.left != null) {
                        q.add(currnode.left);
                    }
                    if (currnode.right != null) {
                        q.add(currnode.right);
                    }

                }

            }

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

        System.out.println(root.data);
        System.out.println("Level Order :");
        node n = root;
        binarytrees tree = new binarytrees();
        tree.levelorder(n);
        System.out.println("Nodes : " + tree.diameter(root));

    }

}