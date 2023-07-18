import java.util.*;

public class roottoleaf {

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

    public static node previous(node root) {

        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root;

    }

    public static node next(node root) {

        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root;

    }

    public static void printrootleaf(node root,ArrayList<Integer> path){
        if(root ==null)
        return ;
        if(root.left==null&&root.right==null){
           System.out.println(path); 
        }
path.add(root.data);
printrootleaf(root.left,path);
printrootleaf(root.right,path);
path.remove(path.size()-1);


    }

    public static void inorder(node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }

    public static void main(String args[]) {
        node root = new node(4);
        root.left = new node(2);
        root.right = new node(5);
        root.left.left = new node(1);
        root.left.right = new node(3);
        root.right.right = new node(6);

        binarytree tree = new binarytree();
        node n = root;
        inorder(n);

        n = root;
        ArrayList<Integer> path=new ArrayList<>();
        printrootleaf(root,path);
    }

}