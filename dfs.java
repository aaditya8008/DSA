import java.lang.String;
import java.util.*;

public class dfs {
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
        for (int i = 0; i < 7; i++) {
            arr[i] = new ArrayList<>();
        }
        // vertex 0
        arr[0].add(new edge(0, 1, 1));
        arr[0].add(new edge(0, 2, 1));
        // vertex 1
        arr[1].add(new edge(1, 0, 1));
       
        arr[1].add(new edge(1, 3, 1));
        // vertex 2
        arr[2].add(new edge(2, 4, 1));
        arr[2].add(new edge(2, 0, 1));
        arr[2].add(new edge(2, 3, 1));
        // vertex 3
        arr[3].add(new edge(3, 1, 1));
         arr[3].add(new edge(3, 4, 1));
        arr[3].add(new edge(3, 5, 1));
        // vertex 4
        arr[4].add(new edge(4, 3, 1));
        arr[4].add(new edge(4, 5, 1));
        //vertex 5
        arr[5].add(new edge(5, 3, 1));
        arr[5].add(new edge(5, 4, 1));
        arr[5].add(new edge(5, 6, 1));
        //vertex 6
        arr[6].add(new edge(6, 5, 1));

    }

    public static void dfs(ArrayList<edge> arr[], int curr, boolean visit[]) {

        System.out.print(curr + " ");

        visit[curr] = true;

        for (int i = 0; i < arr[curr].size(); i++) {
            edge e = arr[curr].get(i);
            if (!visit[e.des]) {
                dfs(arr, e.des, visit);
            }
        }

    }

    public static void main(String args[]) {
        int v = 7;
        ArrayList<edge> arr[] = new ArrayList[v]; // ArrayList storing ArrayList
        creategraph(arr);
        boolean visit[] = new boolean[arr.length];
        dfs(arr, 0, visit);

    }

}
