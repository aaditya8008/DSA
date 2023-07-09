import java.util.Scanner;
import java.util.Stack;

public class bottompush {
    public static void pushbottom(Stack s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = (int) s.pop();
        pushbottom(s, data);
        s.push(top);
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt();
        System.out.println("Enter Data : ");
        for (int i = 0; i < size; i++) {
            s.push(sc.nextInt());
        }
        System.out.println(s);
        System.out.println("Enter Data to push: ");
        pushbottom(s, sc.nextInt());
        System.out.println(s);
    }

}