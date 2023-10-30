import java.lang.String;
import java.util.*;

public class directedcycle {
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
        arr[0].add(new edge(0, 2, 1));

        // vertex 1
        arr[1].add(new edge(1, 0, 1));
        // vertex 2
        arr[2].add(new edge(2, 3, 1));
        // vertex 3
        arr[3].add(new edge(3, 0, 1));

    }

    public static boolean isCycle(ArrayList<edge> arr[]) {
        boolean vis[] = new boolean[arr.length];
        boolean stack[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(arr, i, vis, stack))
                    return true;
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<edge> arr[], int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;
        for (int i = 0; i < arr.length; i++) {
            edge e = arr[curr].get(i);
            if (stack[e.des]) {
                return true;
            } else {
                if (!vis[e.des] && isCycleUtil(arr, e.des, vis, stack)) {
                    return true;
                }
            }
 
        }
        stack[curr] = false;
        return false;

    }

    public static void main(String args[]) {
        int v = 7;
        ArrayList<edge> arr[] = new ArrayList[v]; // ArrayList storing ArrayList
        creategraph(arr);

        System.out.println(isCycle(arr));

    }

}
