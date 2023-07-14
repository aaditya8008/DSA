import java.util.*;

public class activityselection {

    public static int maxtask(int s[], int e[]) {
        int count = 1;
        int i = 1;
        int j = 0;
        ArrayList<Integer> id = new ArrayList<>();
        id.add(0);
        while (i < s.length && j < e.length) {
            if (e[j] <= s[i]) {
                id.add(i);
                count++;
                i++;
                j++;

            } else {
                i++;

            }

        }
        for (i = 0; i < id.size(); i++) {
            System.out.println("Task : " + id.get(i));
        }

        return count;

    }

    public static void main(String args[]) {

        int s[] = { 1, 3, 0, 5, 8, 5 };
        int e[] = { 2, 4, 6, 7, 9, 9 };

        System.out.println("Max Task : " + maxtask(s, e));

    }
}