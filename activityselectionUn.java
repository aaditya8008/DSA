import java.util.Comparator;
import java.util.*;

public class activityselectionUn {

    public static int maxtask(int s[], int e[]) {
        int count = 1;
        int i = 1;
        int j = 0;
        int activities[][] = new int[s.length][3];
        for (i = 0; i < s.length; i++) {
            activities[i][0] = i;
            activities[i][1] = s[i];
            activities[i][2] = e[i];

        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> id = new ArrayList<>();
        id.add(activities[0][0]);
        j = activities[0][2];
        for (i = 1; i < e.length; i++) {
            if (activities[i][1] >= j) {
                count++;
                id.add(activities[i][0]);
                j = activities[i][2];

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