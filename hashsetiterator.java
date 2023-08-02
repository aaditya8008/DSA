import java.util.*;

public class hashsetiterator {

    public static void main(String args[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            hs.add(i);
        }
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (int i : hs) {
            System.out.println(i);
        }
    }
}