import java.util.*;

class reversestringstack {
    public static void main(String args[]) {
        Stack<Character> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        System.out.println(sb.toString());

    }
}