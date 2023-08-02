import java.util.*;

public class treehashset {
    public static void main(String args[]) {
        TreeSet<Integer> hs = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            hs.add(sc.nextInt());
        }
        Iterator i = hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

}