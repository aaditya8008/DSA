import java.util.*;

public class wordbreak {

    static class node {
        node children[] = new node[26];
        boolean eow = false;

        node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static node root = new node();

    public static void insert(String word) {
        node curr = root;
        for (int lev = 0; lev < word.length(); lev++) {
            int idx = word.charAt(lev) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new node();
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

    public static boolean wordbreak(String key) {
        if (key.length() == 0)
            return true;
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordbreak(key.substring(i))) {
                return true;

            }

        }
        return false;
    }

    public static void main(String args[]) {
        String words[] = { "i", "like", "sam", "samsung", "mobile", "ice" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        String key = "ilikesamsung";
        System.out.println(wordbreak(key));
    }

}