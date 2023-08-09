import java.util.*;

public class startswith {

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

    public static void main(String args[]) {
        String words[] = { "zebra", "dog", "duck", "dove", "mobile", "ice" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        root.freq = -1;
        System.out.println(findprefix("duc"));
    }

}