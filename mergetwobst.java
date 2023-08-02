import java.util.*;

public class mergetwobst {

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
        node root = new node((int) arr.get(mid));
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

    public static ArrayList inorderarray(node root, ArrayList<Integer> arr, int i) {
        if (root == null)
            return null;
        inorderarray(root.left, arr, i + 1);
        arr.add(root.data);
        inorderarray(root.right, arr, i + 1);
        return arr;
    }

    public static ArrayList mergearray(ArrayList<Integer> arr, ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        int one = 0;
        int two = 0;
        int i = 0;
        int j = 0;
        while (i != arr1.size() && j != arr2.size()) {
            one = (int) arr1.get(i);
            two = (int) arr2.get(j);
            if (one <= two) {
                arr.add(one);
                i++;
            } else {
                arr.add(two);
                j++;
            }

        }

        while (i != arr1.size()) {
            one = (int) arr1.get(i);
            arr.add(one);
            i++;
        }
        while (j != arr2.size()) {
            two = (int) arr2.get(j);
            arr.add(two);
            j++;
        }

        return arr;
    }

    public static void main(String args[]) {
        node root1 = new node(2);
        root1.left = new node(1);
        root1.right = new node(4);

        node root2 = new node(9);
        root2.left = new node(3);
        root2.right = new node(12);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1 = inorderarray(root1, arr1, 0);
        arr2 = inorderarray(root2, arr2, 0);
        arr = mergearray(arr, arr1, arr2);

        node newroot = createtree(arr, 0, arr.size() - 1);
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr);
        inorder(newroot);

    }

}