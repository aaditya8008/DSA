import java.util.*;

public class linkedliststack {
     static class node {
            int data;
            node next;
           

            node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    public static class stack {
       
 static node top;
        public static boolean isempty() {
            return top == null;
        }

        public static void push(int data) {
            node n = new node(data);
            if (top == null) {
                top = n;
            } else {
                n.next = top;
                top = n;
            }
        }

        public static int pop() {
            if(isempty()){
                return -1;
            }
            int x = top.data;
            top = top.next;
            return x;
        }

        public static int peek() {
              if(isempty()){
                return -1;
            }
            return top.data;
        }

        public static void print() {
            node n = top;
            System.out.println("Data :");
            while (n != null) {
                System.out.println(n.data);
                n = n.next;
            }
        }

    }

    public static void main(String args[]) {
        stack s = new stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt();
        System.out.println("Enter Data : ");
        for (int i = 0; i < size; i++) {
            s.push(sc.nextInt());
        }
        s.print();
        while(s.top!=null){
           System.out.println( "Popped: "+s.pop());
        }
        s.print();

    }

}