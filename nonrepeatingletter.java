import java.util.*;

public class nonrepeatingletter {

    public static void nonrep(Queue q, String str, int freq[]) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while (!q.isEmpty() && freq[(char) q.peek() - 'a'] > 1) {

                q.remove();
            }
            if (q.isEmpty()) {
                System.out.println(-1 + " ");
            } else {

                System.out.println(q.peek() + " ");
            }

        }
        System.out.println();

    }

    public static void main(String args[]) {
        Queue<Character> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        int freq[] = new int[26];
        nonrep(q, str, freq);

    }

}