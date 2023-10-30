
import java.util.*;

public class topsortbfs{
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
        arr[2].add(new edge(2, 3, 1));
        arr[3].add(new edge(3, 1, 1));
        arr[4].add(new edge(4, 0, 1));
        arr[4].add(new edge(4, 1, 1));

        arr[5].add(new edge(5, 0, 1));
        arr[5].add(new edge(5, 2, 1));
    }
    public static void calcIndeg(ArrayList<edge> arr[],int indeg[]){
     for(int i=0;i<arr.length;i++){
        int v=i;
        for(int j=0;j<arr[v].size();j++){
         edge e=arr[v].get(j);
         indeg[e.des]++;
        }
     }

    }

static void topsort(ArrayList<edge> arr[]){
int indeg[]=new int[arr.length];
calcIndeg(arr, indeg);
Queue<Integer> q=new LinkedList<>();
for(int i=0;i<indeg.length;i++){
if(indeg[i]==0){
    q.add(i);
}


}
while(!q.isEmpty()){
int curr=q.remove();
System.out.print(curr+" ");
for(int i=0;i<arr[curr].size();i++){
edge e=arr[curr].get(i);
indeg[e.des]--;
if(indeg[e.des]==0){
    q.add(e.des);
}

}

}
System.out.println();
}
   

    public static void main(String args[]) {
        int v = 7;
        ArrayList<edge> arr[] = new ArrayList[v]; // ArrayList storing ArrayList
        creategraph(arr);

        topsort(arr);
       

    }

}
