import java.util.*;

public class unioninterset {
    public static void main(String args[]) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        HashSet<Integer> s = new HashSet<>();
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        for (int i = 0; i < arr1.length; i++) {
            s.add(arr1[i]);

        }
        for (int i = 0; i < arr2.length; i++) {
            s.add(arr2[i]);
        }
        System.out.println("Union : " + s);
        for (int i = 0; i < arr2.length; i++) {
            s1.add(arr2[i]);

        }
        System.out.print("Intersection : ");
        for (int i = 0; i < arr1.length; i++) {
            if (s1.contains(arr1[i])) {
                System.out.print(arr1[i] + " ");
            }
        }

    }

}