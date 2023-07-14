import java.util.*;

public class diametertree2 {

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

    static class info{
    int diameter;
    int height;
    info(int diameter,int height){
        this.diameter=diameter;
        this.height=height;
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
    public static info diameter(node root) {
           if(root==null)
           return new info(0,0);
            info leftinfo=diameter(root.left);
            info rightinfo=diameter(root.right);
            int diam=Math.max(Math.max(leftinfo.diameter, rightinfo.diameter), leftinfo.height+rightinfo.height+1);
            int height=Math.max(leftinfo.height,rightinfo.height)+1;
            return new info(diam, height);

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
        
        node n = root;
        binarytrees tree = new binarytrees();
       System.out.println("Diameter : "+diameter(n).diameter);

    }

}