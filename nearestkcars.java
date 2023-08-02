import java.util.*;

public class nearestkcars {

    static class point implements Comparable<point> {
        int x;
        int y;
        int dist;

        public point(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }

        @Override
        public int compareTo(point p2) {
            return this.dist - p2.dist;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<point> pq = new PriorityQueue<>();
        int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        for (int i = 0; i < pts.length; i++) {
            pq.add(new point(pts[i][0], pts[i][1], (int) Math.sqrt(pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1])));
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(pq.peek().x + " + " + pq.peek().y + " = " + pq.peek().dist + "\n");
            pq.remove();
        }
    }

} 