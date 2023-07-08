import java.util.*;

public class linkedlistjcf {

    public static void main(String args[]) {
        // create
        LinkedList<Integer> list = new LinkedList<>();
        // add
        list.addLast(1);
        list.addLast(2);
        list.addFirst(0);
        // print
        System.out.println(list);
        list.removeLast();
        list.removeFirst();
        System.out.println(list);

    }
}