import java.util.*;

public class topviewbt {

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

    }

    static class info {
        node n;
        int hd;

        public info(node n, int hd) {
            this.n = n;
            this.hd = hd;
        }

    }

    public static void topview(node root) {
        Queue<info> q = new LinkedList<>();
        HashMap<Integer, node> map = new HashMap<>();
        int max = 0, min = 0;
        q.add(new info(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.n);
                }
                if (curr.n.left != null) {
                    q.add(new info(curr.n.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.n.right != null) {
                    q.add(new info(curr.n.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.println(map.get(i).data + " ");
        }
        System.out.println();

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
        System.out.println("Top : \n");
        topview(n);
    }

}