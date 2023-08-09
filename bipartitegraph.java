import java.lang.String;
import java.util.*;

public class bipartitegraph {
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
        // vertex 5
        arr[5].add(new edge(5, 3, 1));
        arr[5].add(new edge(5, 4, 1));
        arr[5].add(new edge(5, 6, 1));
        // vertex 6
        arr[6].add(new edge(6, 5, 1));

    }

    public static boolean detect(ArrayList<edge> arr[]) { // dfs
        int color[] = new int[arr.length];
        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (color[i] == -1) {
                q.add(i);
                color[i] = 0;// yellow
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < arr[curr].size(); j++) {
                        edge e = arr[curr].get(j);
                        if (color[e.des ]== -1) {
                            int nextcol = color[curr] == 0 ? 1 : 0;
                            color[e.des] = nextcol;

                        } else if (color[e.des] == color[curr]) {
                            return false;
                        }

                    }

                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int v = 7;
        ArrayList<edge> arr[] = new ArrayList[v]; // ArrayList storing ArrayList
        creategraph(arr);
        boolean visit[] = new boolean[arr.length];
        System.out.println(detect(arr));

    }

}
