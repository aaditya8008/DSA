import java.util.*;

public class hashmapiter {

    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 1);
        hm.put("America", 2);
        hm.put("Russia", 3);
        hm.put("Australia", 4);
        hm.put("UAE", 5);
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("Keys :" + k + ",Value :" + hm.get(k));
        }

    }

}