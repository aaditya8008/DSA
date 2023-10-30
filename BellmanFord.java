import java.util.*;

public class BellmanFord {
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
        arr[1].add(new edge(1, 2, -4));

        arr[2].add(new edge(2, 3, 2));
        arr[3].add(new edge(3, 4, 4));
        arr[4].add(new edge(4, 1, -1));

    }

    

    static void belmanford(ArrayList<edge> arr[], int src) {
        int dist[] = new int[arr.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }

        }
        int v = arr.length;
        for (int i = 0; i < v - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].size(); k++) {
                    edge e = arr[j].get(k);
                    int u = e.src;
                   
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wgt < dist[e.des]) {
                        dist[e.des] = dist[u] + e.wgt;

                    }

                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int v = 5;
        ArrayList<edge> arr[] = new ArrayList[v]; // ArrayList storing ArrayList
        creategraph(arr);
        int src = 0;
belmanford(arr, src);
    }

}