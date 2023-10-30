import java.util.*;

public class primsgraph {
    static class edge {
        int src;
        int des;
        int wgt;

        edge(int src, int des, int wgt) {
            this.src = src;
            this.des = des;
            this.wgt = wgt;
        }

    }

    static void creategraph(ArrayList<edge> arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }
        // vertex
        arr[0].add(new edge(0, 1, 10));
        arr[0].add(new edge(0, 2, 15));
        arr[0].add(new edge(0, 3, 30));

        arr[1].add(new edge(1, 0, 10));
        arr[1].add(new edge(1, 3, 40));

        arr[2].add(new edge(2, 0, 15));
        arr[2].add(new edge(2, 3, 50));

        arr[3].add(new edge(3, 1, 40));
        arr[3].add(new edge(3, 2, 50));

    }

    static class pair implements Comparable<pair> {
        int n;
        int cost;

        public pair(int n, int cost) {
            this.n = n;
            this.cost = cost;
        }

        @Override
        public int compareTo(pair p2) {
            return this.cost - p2.cost;
        }

    }

    public static void prims(ArrayList<edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(0, 0));
        int finalcost = 0;
        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                finalcost += curr.cost;
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    edge e = graph[curr.n].get(i);

                    pq.add(new pair(e.des, e.wgt));
                }

            }

        }
        System.out.println(finalcost);

    }

    public static void main(String args[]) {
        int v = 5;
        ArrayList<edge> arr[] = new ArrayList[v]; // ArrayList storing ArrayList
        creategraph(arr);
        int src = 0;
        prims(arr);

    }

}