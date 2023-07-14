import java.util.*;

public class traversalorders {

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

        public static void postorder(node root) {

            node n = root;
            if (n == null) {
                return;
            }
            postorder(n.left);
            postorder(n.left);
            System.out.println(n.data);

        }

        public static void inorder(node root) {

            node n = root;
            if (n == null) {
                return;
            }
            inorder(n.left);
            System.out.println(n.data);
            inorder(n.right);

        }

    }

    public static void main(String args[]) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binarytrees tree = new binarytrees();
        node root = tree.buildtree(nodes);
        System.out.println(root.data);
        System.out.println("Pre Order :");
        tree.preorder(root);
        System.out.println("Post Order :");
        tree.postorder(root);
        System.out.println("In-Order :");
        tree.inorder(root);
    }

}