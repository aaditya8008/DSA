import java.util.*;

public class merge&quicksort{

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int s, int e) {
        if (s >= e)
            return;
        int mid = s + (e - s) / 2;

        mergesort(arr, s, mid); // left part
        mergesort(arr, mid + 1, e); // right part
        merge(arr, s, mid, e);

    }

    public static void merge(int arr[], int s, int mid, int e) {
        int temp[] = new int[e - s + 1];
        int i = s; // iterator for left
        int j = mid + 1; // iterator for right
        int k = 0; // temp
        while (i <= mid && j <= e) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= e) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = s; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void quicksort(int arr[], int s, int e) {
        if (s > e)
            return;
        int pidx = partition(arr, s, e);
        quicksort(arr, s, pidx - 1);// left
        quicksort(arr, pidx + 1, e);

    }

    public static int partition(int arr[], int s, int e) {
        int pivot = arr[e];
        int i = s - 1;
        for (int j = s; j < e; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }

        }
        i++;
        int temp = pivot;
        arr[e] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        quicksort(arr, 0, arr.length - 1);
        print(arr);

    }
}