import java.lang.String;
import java.util.*;

public class extra {

    static class edge {
        int src;
        int des;
        int wgh;

        edge(int src, int des, int wgh) {
            this.src = src;
            this.des = des;
            this.wgh = wgh;
        }
    }

    static void create(ArrayList arr[]) {
        for (int i = 0; i < arr.length; i++) {
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

    static void access(int n, ArrayList graph[]) {
        for (int i = 0; i < graph[n].size(); i++) {
            edge e = (edge) graph[n].get(i);
            System.out.println(e.des);

        }

    }
    public static void bfs(ArrayList<edge> arr[]) {
        boolean visited[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                bfsutil(arr, visited);
            }
        }
    }

    static void bfsutil(ArrayList<edge> arr[],boolean check[]) {
        Queue<Integer> q = new LinkedList<>();
      
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!check[curr]) {
                System.out.println(curr + " ");
                check[curr] = true;
                for (int i = 0; i < arr[curr].size(); i++) {
                    q.add(arr[curr].get(i).des);
                }
            }
        }

    }

    static void dfs(ArrayList<edge> arr[]){
boolean vis[]=new boolean[arr.length];
for(int i=0;i<arr.length;i++){
    if(!vis[i]){
        dfsutil(arr, i, vis);
    }
}


    }

    static void dfsutil(ArrayList<edge> arr[], int curr, boolean vis[]) {

        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < arr[curr].size(); i++) {
            edge e = arr[curr].get(i);
            if (!vis[e.des]) {
                dfsutil(arr, e.des, vis);
            }
        }

    }

    public static void main(String args[]) {
        int size;
        System.out.println("Enter Size :\n");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        ArrayList<edge> graph[] = new ArrayList[size];
        create(graph);
        System.out.println("Enter Node to access :\n");
        int no = sc.nextInt();
        access(no, graph);
        System.out.println("Bfs :\n");
        bfs(graph);
        boolean check[] = new boolean[graph.length];
         System.out.println("Dfs :\n");
        dfs(graph);

    }

}