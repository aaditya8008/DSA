import java.lang.String;
import java.util.*;

public class findsubtree {
  static class node {
    int data;
    node left;
    node right;

    node(int data) {
      this.data = data;
      this.right = null;
      this.left = null;
    }
  }

  static class binarytree {
    static int idx = -1;

    static node buildtree(int nodes[]) {
      idx++;
      if (nodes[idx] == -1) {
        return null;
      }
      node newnode = new node(nodes[idx]);
      newnode.left = buildtree(nodes);
      newnode.right = buildtree(nodes);
      return newnode;
    }

    static void prefix(node root) {
      node n = root;
      if (n == null) {
        return;
      }
      System.out.println(n.data);
      prefix(n.left);
      prefix(n.right);

    }

    static int count(node root) {
      node n = root;
      if (n == null) {
        return 0;
      }
      int left = count(n.left);
      int right = count(n.right);
      return left + right + 1;

    }

    static int height(node root) {
      node n = root;
      if (n == null) {
        return 0;
      }
      int left = height(n.left);
      int right = height(n.right);
      return Math.max(left, right) + 1;

    }

    static void levelorder(node n) {
      if (n == null) {
        return;
      }

      Queue<node> q = new LinkedList<>();
      q.add(n);
      q.add(null);
      while (!q.isEmpty()) {
        node curr = q.remove();
        if (curr == null) {
          System.out.println();
          if (q.isEmpty()) {
            break;
          } else {
            q.add(null);

          }
        } else {
          System.out.print(curr.data + " ");
          if (curr.right != null) {
            q.add(curr.right);
          }
          if (curr.left != null) {
            q.add(curr.left);
          }

        }

      }

    }

    static boolean isidentical(node root, node sub) {
      if (root == null && sub == null) {
        return true;
      } else if (root == null || sub == null || root.data != sub.data) {
        return false;
      }

      return isidentical(root.left, sub.left) || isidentical(root.right, sub.right);
    }

    static boolean ismatch(node root, node sub) {
      if (root == null) {
        return false;
      }
      if (root.data == sub.data) {
        if (isidentical(root, sub)) {
          return true;
        } else {
          return false;
        }
      }
      boolean left = ismatch(root.left, sub);
      boolean right = ismatch(root.right, sub);
      return left || right;
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
    node sub = new node(2);
    sub.left = new node(4);
    sub.right = new node(5);
    binarytree tree = new binarytree();
    tree.prefix(root);
    node n = root;
    tree.levelorder(n);
    System.out.println("Count : " + tree.count(root));
    System.out.println("Height : " + tree.height(root));
    System.out.println("Matched : " + tree.ismatch(root, sub));

  }
}
