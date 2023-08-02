import java.util.*;

public class zerosumarr {

    public static void main(String args[]) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int maxl = 0;
        int maxr = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (hm.containsKey(sum)) {
                if (max < i - hm.get(sum)) {
                    max = i - hm.get(sum);
                    maxl = i;
                    maxr = hm.get(sum);
                }
            }
           else{
            hm.put(sum,i);
           }

        }
        System.out.println(max + " between =" + maxl + " : " + maxr);
    }

}