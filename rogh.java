import java.util.*;

import java.util.*;

public class rogh {

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

        public static void kthnode(node root,int level,int k){
          if(root==null)
          return;
          if(level==k){
            System.out.println("Data :"+root.data);
          }
          kthnode(root.left, level, k+1);
          kthnode(root.right, level, k+1);


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
        tree.kthnode(root, 2, 1);
    }

}