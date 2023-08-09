import java.util.*;

public class unqsbstr {
    static class node {
        node children[] = new node[26];
        boolean eow = false;
        int freq;

        node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static node root = new node();

    public static void insert(String word) {
        node curr = root;
        for (int lev = 0; lev < word.length(); lev++) {
            int idx = word.charAt(lev) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null)
                return false;
            curr = curr.children[idx];
        }

        return curr.eow == true;

    }

    public static boolean findprefix(String s) {
        node curr = root;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static int countnodes(node root) {
        if (root == null)
            return 0;
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countnodes(root.children[i]);
            }
        }
        return count + 1;
    }

    public static void main(String args[]) {
        String str = "apple";

        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(countnodes(root));
    }
}