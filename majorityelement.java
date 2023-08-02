import java.util.*;

public class majorityelement {

    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        Set<Integer> Key = map.keySet();
        for (Integer k : Key) {
            if (map.get(k) > arr.length / 3) {
                System.out.println(k + "  " + map.get(k));
            }
        }

    }
}