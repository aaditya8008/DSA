import java.util.*;

public class longwrdpref {
    static class node {
        node children[] = new node[26];
        boolean eow = false;

        node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }

        }
    }

    public static String ans = "";
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

    public static void longestword(node root, StringBuilder temp) {
        if (root == null)
            return;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestword(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }

        }

    }

    public static void main(String args[]) {
        String str[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };

        for (int i = 0; i < str.length; i++) {
            insert(str[i]);
        }
       
        longestword(root, new StringBuilder(""));
        System.out.println(ans);
    }
}