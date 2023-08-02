import java.util.*;

public class linkedhashset {

    public static void main(String args[]) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            hs.add(sc.nextInt());
        }
        for (int i : hs) {
            System.out.println(i);
        }

    }
}