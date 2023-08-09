import java.lang.String;
import java.util.*;

public class graphcreation {
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

    public static void main(String args[]) {

        ArrayList<edge> arr[] = new ArrayList[5]; // ArrayList storing ArrayList
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
        for (int i = 0; i < arr[2].size(); i++) {
            edge e = arr[2].get(i);
            System.out.println(e.des);

        }

    }

}
