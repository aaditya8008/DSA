import java.util.LinkedHashMap;
import java.util.Set;

public class linkedhashmap {

    public static void main(String args[]) {
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        hm.put("India", 150);
        hm.put("China", 200);
        hm.put("America", 50);
        hm.put("Nepal", 25);
        System.out.println(hm);
        hm.remove("Nepal");
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        for (String k : keys) {
            System.out.println(k + " " + hm.get(k));
        }
    }

}