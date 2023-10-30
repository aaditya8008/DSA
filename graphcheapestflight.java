import java.lang.String;
import java.util.*;

public class graphcheapestflight {
    public static class edge {
        int src;
        int dest;
        int wt;

        public edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    };

    static class info {
        int v;
        int cost;
        int stops;

        public info(int v, int c, int s) {
            this.v = v;
            this.cost = c;
            this.stops = s;
        }

    }

    public static int cheapestFlight(int n, int flight[][], int src, int dest, int k) {
        ArrayList<edge> graph[] = new ArrayList[n];
        creategraph(flight, graph);

        int dist[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue<info> q = new LinkedList<>();
        q.add(new info(src, 0, 0));
        while (!q.isEmpty()) {
            info curr = q.remove();
            if (curr.stops > k) {
                break;
            }
            for (int i = 0; i < graph[curr.v].size(); i++) {
                edge e = graph[curr.v].get(i);
                if (curr.cost + e.wt < dist[e.dest] && curr.stops <= k) {
                    dist[e.dest] = curr.cost + e.wt;
                    q.add(new info(e.dest, dist[e.dest], curr.stops + 1));

                }
            }
        }
        if (dist[dest] != Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dest];
        }
    }

    public static void creategraph(int flight[][], ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < flight.length; i++) {
            int src = flight[i][0];
            int dest = flight[i][1];
            int wt = flight[i][2];

            edge e = new edge(src, dest, wt);
            graph[src].add(e);

        }

    }

    public static void main(String args[]) {
        int n = 4;
        int flight[][] = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        int src = 0, dst = 3, k = 1;

        System.out.println(cheapestFlight(n, flight, src, dst, k));
    }

}
