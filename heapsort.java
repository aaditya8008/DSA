import java.util.*;

public class heapsort {
    public static void heapify(int arr[], int i, int end) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int maxidx = i;
        if (l < end && arr[maxidx] < arr[l]) {
            maxidx = l;
        }
        if (r < end && arr[maxidx] < arr[r]) {
            maxidx = r;
        }
        if (maxidx != i) {
            int temp = arr[i];
            arr[i] = arr[maxidx];
            arr[maxidx] = temp;
            heapify(arr, maxidx, end);
        }

    }

    public static void Heapsort(int arr[]) {
        // s-1 max heap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);

        }

        // s-2 push largest at end

        for (int i = n - 1; i > 0; i--) {
            // swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 5, 3 };
        Heapsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}