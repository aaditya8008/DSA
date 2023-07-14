import java.util.*;

public class levelorder {

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

        public static void preorder(node root) {

            node n = root;
            if (n == null) {
                return;
            }
            System.out.println(n.data);
            preorder(n.left);
            preorder(n.right);
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

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binarytrees tree = new binarytrees();
        node root = tree.buildtree(nodes);
        System.out.println(root.data);
        System.out.println("Level Order :");
        node n = root;
        tree.levelorder(n);
    }

}