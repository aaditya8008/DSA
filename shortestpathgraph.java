import java.util.*;

public class shortestpathgraph {
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
        arr[0].add(new edge(0, 1, 2));
        arr[0].add(new edge(0, 2, 4));
        arr[1].add(new edge(1, 3, 7));
        arr[1].add(new edge(1, 2, 1));
        arr[2].add(new edge(2, 4, 3));
        arr[3].add(new edge(3, 5, 1));
        arr[4].add(new edge(4, 3, 2));
        arr[4].add(new edge(4, 5, 5));

    }

    static class pair implements Comparable<pair> {
        int n;
        int path;

        public pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(pair p2) {
            return this.path - p2.path;
        }
    }

    static void dijkstra(ArrayList<edge> arr[], int src) {
        int dist[] = new int[arr.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }

        }
        boolean vis[] = new boolean[arr.length];
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(src, 0));

        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                for (int i = 0; i < arr.length; i++) {
                    edge e = arr[curr.n].get(i);
                    int u = e.src;
                    int v = e.des;
                    int wt = e.wgt;
                    if (dist[u] + wt < dist[v])  
                        dist[v] = dist[u] + wt;
                        pq.add(new pair(v, dist[v]));
                    }
                }

            }for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();

        }
        
    

    public static void main(String args[]) {
        int v = 6;
        ArrayList<edge> arr[] = new ArrayList[v]; // ArrayList storing ArrayList
        creategraph(arr);
        int src = 0;
        dijkstra(arr, src);

    }


}