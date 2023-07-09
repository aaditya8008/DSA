import java.util.*;

class validbracket {
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
        if (c == '(' || c == ')' || c == '{' || c == '}' || c == '[' || c == ']')
            return true;
        return false;

    }

    public static boolean parenmatch(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isbracket(c)) {
                if (c == '(' || c == '{' || c == '[') {
                    s.push(c);
                } else {
                    char x = s.pop();
                    if (!match(x, c)) {
                        return false;
                    }
                }
            }

        }
        return true;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        boolean result = parenmatch(str);
        System.out.println(result);
    }

}