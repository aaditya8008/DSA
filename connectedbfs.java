import java.lang.String;
import java.util.*;

public class connectedbfs {
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
        for (int i = 0; i < 5; i++) {
            arr[i] = new ArrayList<>();
        }
        // vertex 0
        arr[0].add(new edge(0, 1, 5));
        // vertex 1
        arr[1].add(new edge(1, 0, 5));
        arr[1].add(new edge(1, 2, 1));
        arr[1].add(new edge(1, 3, 3));
        // vertex 2
        arr[2].add(new edge(2, 4, 2));
        arr[2].add(new edge(2, 1, 1));
        arr[2].add(new edge(2, 3, 1));
        // vertex 3
        arr[3].add(new edge(3, 1, 3));
        arr[3].add(new edge(3, 2, 1));
        // vertex 4
        arr[4].add(new edge(4, 2, 2));

    }

    public static void bfs(ArrayList<edge> arr[]) {
        boolean visited[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                bfsutil(arr, visited);
            }
        }
    }

    public static void bfsutil(ArrayList<edge> arr[], boolean visited[]) { // 0(V+E)
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " "); // s-1 print
                visited[curr] = true; // visited
                for (int i = 0; i < arr[curr].size(); i++) {
                    edge e = arr[curr].get(i);
                    q.add(e.des); // add neighbor in queue
                }
            }
        }
    }

    public static void main(String args[]) {
        int v = 5;
        ArrayList<edge> arr[] = new ArrayList[v]; // ArrayList storing ArrayList
        creategraph(arr);
        bfs(arr);

    }

}
