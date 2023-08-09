import java.util.*;

public class graph_creation {
    static class edge {
        int src;
        int dest;
        int wt;

        public edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void main(String args[]) {
        int v = 5; // vertices
        ArrayList<edge>[] graph = new ArrayList[v]; // array of arraylist

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>(); // null-> empty arraylist
        }

        // input

        graph[0].add(new edge(0, 1, 5));
        graph[1].add(new edge(1, 0, 5));
        graph[2].add(new edge(1, 2, 1));
        graph[3].add(new edge(1, 3, 3));
        graph[4].add(new edge(2, 4, 2));
        graph[5].add(new edge(2, 1, 1));
        graph[6].add(new edge(2, 3, 1));
        graph[7].add(new edge(3, 1, 3));
        graph[8].add(new edge(3, 2, 1));
        graph[9].add(new edge(4, 2, 2));

        // 2's neighbours
        for (int i = 0; i < graph[2].size(); i++) {
            edge e = graph[2].get(i);// src,desk,wt
            System.out.println(e.dest);
        }

    }

}