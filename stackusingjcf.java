import java.util.Scanner;
import java.util.Stack;

public class stackusingjcf {
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
        while (!s.isEmpty()) {
            System.out.println("Popped: " + s.pop());
        }
        System.out.println(s);

    }

}