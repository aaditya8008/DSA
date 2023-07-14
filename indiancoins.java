import java.util.*;

public class indiancoins {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int count = 0;
        int sum = 0;
        int value = 590;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (sum + arr[i] <= value) {
                System.out.println("Given : " + arr[i] + " Rs");
                sum = sum + arr[i];
                count++;
                i++;
            }
        }
        System.out.println("Used : " + count + " Coins");

    } 

}