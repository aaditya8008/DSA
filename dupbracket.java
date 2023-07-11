import java.util.*;

class dupbracket {
    public static boolean match(char s, char c) {
        if (s == '(' && c == ')')
            return true;
        else if (s == '{' && c == '}')
            return true;
        else if (s == '[' && c == ']')
            return true;
        return false;

    }

    public static boolean isbracket(char c) {
        if (c == ')' || c == '}' || c == ']')
            return true;
        return false;

    }

    public static boolean parenmatch(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isbracket(c)) {
                if (match(s.peek(), c)) {
                    return false;
                } else {
                    while (!match(s.peek(), c)) {
                        s.pop();
                    }
                    s.pop();
                }
            } else {
                s.push(c);
            }

        }

        return true;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        boolean result = parenmatch(str);
        System.out.println("Valid : "+result);
    }

}