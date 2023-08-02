import java.util.*;

public class hashmap {

    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 1);
        hm.put("America", 2);
        hm.put("Russia", 3);
        hm.put("Australia", 4);
        hm.put("UAE", 5);
        System.out.println(hm.get(("India")));
        hm.remove("India", 1);
        System.out.println(hm.containsKey("India"));

    }

}