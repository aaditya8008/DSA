import java.lang.String;
import java.util.*;

class reversestack {
    public static void pushbottom(Stack s, char data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        char top = (char) s.pop();
        pushbottom(s, data);
        s.push(top);
    }

    public static Stack reverse(Stack s) {
        if (s.isEmpty()) {
            return null;
        }
        char x = (char) s.pop();
        reverse(s);

        pushbottom(s, x);
        return s;

    }

    public static void main(String args[]) {
        Stack<Character> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        System.out.println(s);
        s = reverse(s);
        System.out.println(s);

    }
}