import java.util.HashSet;
import java.util.Scanner;

public class hashset {

    public static void main(String args[]) {
        HashSet<Integer> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            hs.add(sc.nextInt());
        }
        System.out.println(hs);
        hs.remove(3);
        System.out.println(hs);

    }
}