import java.lang.String;
import java.util.*;
public class toposortdfs{

    static class edge{
int src;
int des;
edge(int src,int des){
    this.src=src;
    this.des=des;
}
    }
   

    static void creategraph(ArrayList arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=new ArrayList<>();
        }
        
      
        // vertex 2
        arr[2].add(new edge(2, 3));
        // vertex 3
        arr[3].add(new edge(3, 1));
        // vertex 4
        arr[4].add(new edge(4, 0));
        arr[4].add(new edge(4, 1));
        
        // vertex 5
        arr[5].add(new edge(5, 0));
        arr[5].add(new edge(5, 2));
        
    }

   static void dfs(ArrayList<edge> arr[]){
    boolean vis[]=new boolean[arr.length];
    Stack<Integer> s=new Stack<>();
    for(int i=0;i<arr.length;i++){
if(!vis[i]){
    dfsutil(arr,vis,i,s);
}
    }
    while(!s.isEmpty())
{
    System.out.print(s.pop()+" ");
}
   }

   static void dfsutil(ArrayList<edge> arr[],boolean vis[],int curr,Stack<Integer> s){
vis[curr]=true;
for(int i=0;i<arr[curr].size();i++){
    edge e=(edge)arr[curr].get(i);
    if(!vis[e.des]){
         dfsutil(arr,vis,e.des,s);
    }
}
s.push(curr);

   }

    

public static void main(String args[]){
ArrayList<edge> arr[]=new ArrayList[7];
creategraph(arr);
dfs(arr);
}

}