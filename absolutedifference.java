import java.util.*;

public class absolutedifference {

    public static void main(String args[]) {
        int arr1[] = { 4, 1, 8, 7 };
        int arr2[] = { 2, 3, 6, 5 };
        int sum = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            sum = sum + Math.abs(arr1[i] - arr2[i]);
        }
        System.out.println(sum);
    }

}