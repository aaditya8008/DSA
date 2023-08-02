import java.util.TreeMap;;
import java.util.Set;

public class treemap {
    // sorted ,0(log n)!=0(1) as sorted
    // red black tree used
    public static void main(String args[]) {
        TreeMap<String, Integer> hm = new TreeMap<>();
        hm.put("India", 150);
        hm.put("China", 200);
        hm.put("America", 50);
        hm.put("Nepal", 25);
        System.out.println(hm);
        Set<String> key = hm.keySet();
        System.out.println(key);
        for (String k : key) {
            System.out.println(k + " " + hm.get(k));
        }
    }

}