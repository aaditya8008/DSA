import java.util.*;

public class bsttobalancedbst {

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

    public static node createtree(ArrayList<Integer> arr, int s, int e) {
        if (s > e)
            return null;

        int mid = (s + e) / 2;
        node root = new node((int)arr.get(mid));
        root.left = createtree(arr, s, mid - 1);
        root.right = createtree(arr, mid + 1, e);

        return root;
    }

    public static void inorder(node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }
     public static ArrayList  inorderarray(node root,ArrayList<Integer> arr,int i) {
        if (root == null)
            return null;
        inorderarray(root.left,arr,i+1);
        arr.add(root.data);
        inorderarray(root.right,arr,i+1);
return arr;
    }

    public static void main(String args[]) {
         node root = new node(4);
        root.left = new node(2);
        root.right = new node(5);
        root.left.left = new node(1);
        root.left.right = new node(3);
        root.right.right = new node(6);
        inorder(root);
        ArrayList<Integer> arr=new ArrayList<>();
        arr=inorderarray(root, arr, 0);
         node newroot=createtree(arr, 0, arr.size()-1);
        System.out.println(arr);
        inorder(newroot);

    }

}