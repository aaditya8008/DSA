import java.util.*;

public class queuereverse {
    public static void reverse(Queue q) {
        Stack<Integer> s = new Stack();
        while (!q.isEmpty()) {
            s.push((int) q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt();
        System.out.println("Enter Data : ");
        for (int i = 0; i < size; i++) {
            q.add(sc.nextInt());
        }
        System.out.println("Data : ");
        System.out.println(q);
        reverse(q);
        System.out.println(q);
    }

}