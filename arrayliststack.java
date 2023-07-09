import java.util.*;

public class arrayliststack {
    public static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isempty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            int top = (int) list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;

        }

        public static int peek() {
            return (int) list.get(list.size() - 1);
        }

    }

    public static void main(String args[]) {
        stack s = new stack();
        System.out.println("Enter Stack Size :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            s.push(sc.nextInt());
        }
        System.out.println(s.list);
        while (!s.isempty()) {
            System.out.println("Popped :" + s.pop());
        }
        System.out.println(s.list);

    }
}