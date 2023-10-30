import java.util.*;

public class allpathgraph {
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
        // vertex
        arr[0].add(new edge(0, 3, 1));
        arr[2].add(new edge(2, 3, 1));
        arr[3].add(new edge(3, 1, 1));
        arr[4].add(new edge(4, 0, 1));
        arr[4].add(new edge(4, 1, 1));

        arr[5].add(new edge(5, 0, 1));
        arr[5].add(new edge(5, 2, 1));
    }

    public static void printall(ArrayList<edge> arr[], int src, int des, String path) {
        if (src == des) {
            System.out.println(path + des);
            return;
        }
        for (int i = 0; i < arr[src].size(); i++) {
            edge e = arr[src].get(i);
            printall(arr, e.des, des, path + src);

        }

    }

    public static void main(String args[]) {
        int v = 7;
        ArrayList<edge> arr[] = new ArrayList[v]; // ArrayList storing ArrayList
        creategraph(arr);
        int src = 5, des = 1;
        printall(arr, src, des, "");

    }

}
