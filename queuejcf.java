import java.util.*;

public class queuejcf {
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>(); // interface can also use ArrayDeque
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size :");
        int size = sc.nextInt();
        System.out.println("Enter Data :");
        for (int i = 0; i < size; i++) {
            q.add(sc.nextInt());
        }
        System.out.println(q);

        q.remove();
        System.out.println(q);

    }

}