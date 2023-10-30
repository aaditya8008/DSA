import java.lang.String;
import java.util.*;

public class extra{
 static class edge{
        int src;
        int dest;

        edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
static void create(ArrayList<edge> arr[]){
    for(int i=0;i<arr.length;i++){
        arr[i]=new ArrayList<>();
    }
    
   // vertex
   arr[0].add(new edge(0, 3));
   arr[2].add(new edge(2, 3));
   arr[3].add(new edge(3, 1));
   arr[4].add(new edge(4, 0));
   arr[4].add(new edge(4, 1));

   arr[5].add(new edge(5, 0));
   arr[5].add(new edge(5, 2));
    

}
static void path(ArrayList<edge> arr[],int src,int dest,String p){
if(src==dest){
    System.out.println(p + dest);
    return;
}
for(int i=0;i<arr[src].size();i++){
edge e = arr[src].get(i);
path(arr,e.dest,dest,p+src);
}
}
public static void main(String args[]){
   int v=7;
   ArrayList<edge> arr[]=new ArrayList[v];
create(arr);
path(arr,5,1,"");


}}