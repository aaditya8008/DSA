import java.util.*;

public class jobseq {
    public static void main(String args[]) {

        int arr[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        int sum = 0;
        int time = 0;
        int prevtime = -1;
        ;

        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));
        for (int i = arr.length - 1; i >= 0; i--) {
            time = arr[i][0];
            if (time > prevtime) {
                sum = sum + arr[i][1];
                System.out.println("Time: " + time + ", Value :" + arr[i][1]);
                prevtime = arr[i][0];
            }

        }
        System.out.println(sum);

    }

}