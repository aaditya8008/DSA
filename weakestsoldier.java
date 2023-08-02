import java.util.*;

public class weakestsoldier {
    static class row implements Comparable<row> {
        int soldiers;
        int idx;

        public row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(row r2) {
            if (this.soldiers == r2.soldiers) {
                return this.idx - r2.idx;
            } else {
                return this.soldiers - r2.soldiers;
            }

        }
    }

    public static void main(String args[]) {
        int array[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 }
        };
        int k = 2;
        PriorityQueue<row> pq = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[0].length; j++) {
                count += array[i][j];
            }
            pq.add(new row(count, i));
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Index : " + pq.peek().idx + " " + "Count : " + pq.peek().soldiers);
            pq.remove();
        }

    }
}