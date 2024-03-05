import java.util.*;

import primsgraph.pair;


public class rogh {

 static class Edge{
    int source;
    int destination;
    int weight;
    Edge(int source,int destination,int weight){
      this.source=source;
      this.destination=destination;
      this.weight=weight;
    }
    void pr(){
      System.out.print("{"+source+","+destination+","+weight+"}");
    }
  }
  static class Graph{
  ArrayList<Edge>[] edgeList=new ArrayList[8];
    
   Graph(){
    for(int i=0;i<edgeList.length;i++)
    edgeList[i]=new ArrayList<>();
   }
    void insert(int s,int d,int w){
      edgeList[s].add(new Edge(s, d, w));
    }
    void pr(){
      System.out.print("{");
      for(int i=0;i<edgeList.length;i++)
      for(int j=0;j<edgeList[i].size();j++)
      edgeList[i].get(j).pr();
      System.out.print("}");
      System.out.println();
    }
    void bfs(){
      boolean vis[]=new boolean[edgeList.length];
for(int i=0;i<edgeList.length;i++){
  if(!vis[i])
  bfshelper( vis,i);
}

    }
    void bfshelper(boolean vis[],int curr){
      Queue<Integer> q =new LinkedList<>();
      q.add(curr);
      while(!q.isEmpty()){
        int x=q.remove();
        

if(!vis[x]){
  vis[x]=true;
  System.out.print(x);
  for(int i=0;i<edgeList[x].size();i++){
  q.add(edgeList[x].get(i).destination);
  }
}
      }
    }
    void dfs(){
      boolean vis[]=new boolean[edgeList.length];
for(int i=0;i<edgeList.length;i++){
  if(!vis[i])
  dfshelper(i, vis);
}

    }

    void dfshelper(int x,boolean vis[]){
      

      System.out.println(x);
  vis[x]=true;
for(int i=0;i<edgeList[x].size();i++){
  
if(!vis[edgeList[x].get(i).destination]){
  dfshelper(edgeList[x].get(i).destination,vis);
}

}
    }
    boolean dfsearch(int x,boolean vis[],int data){
      if(x==data){
        return true;
      }
      System.out.println(x);
  vis[x]=true;
for(int i=0;i<edgeList[x].size();i++){
  
if(!vis[edgeList[x].get(i).destination]){
  return dfsearch(edgeList[x].get(i).destination,vis,data);
}
}
return false;

    }
    public  boolean isBipartite(){
      int color[]=new int[edgeList.length];
      for(int i=0;i<edgeList.length;i++){
        color[i]=-1;
      }
      Queue<Integer> q =new LinkedList<>();
     
      for(int i=0;i<edgeList.length;i++){
        if(color[i]==-1){
        q.add(i);
      color[i]=0;
      while(!q.isEmpty()){
        int x=q.remove();
        for(int j=0;j<edgeList[x].size();j++){
          Edge e=edgeList[x].get(j);
          if(color[e.destination]==-1){
            color[e.destination]=color[x]==0?1:0;
            q.add(e.destination);
          }
          else if(color[e.destination]==color[x]){
            return false;
          }
          
        }
      }
      }
      }
     return true;
    }

    public boolean isCycledfs(){
      boolean vis[]=new boolean[edgeList.length];
      boolean stack[]=new boolean[edgeList.length];
      for(int i=0;i<edgeList.length;i++){
        if(!vis[i]){
        if(isCycleUtil(i,vis,stack)){
          return true;
        }}
      }
return false;
    }
    boolean isCycleUtil(int curr,boolean vis[],boolean stack[]){
      vis[curr]=true;
      stack[curr]=true;
      for(int i=0;i<edgeList[curr].size();i++){
      Edge e=edgeList[curr].get(i);
      if(stack[e.destination]){
        return true;
      }
      if(!vis[e.destination]&& isCycleUtil(e.destination, vis, stack)){
        return true;
      }

      }
return false;
    }
boolean isCycle(int curr,boolean vis[],int parent){
vis[curr]=true;
  for(int i=0;i<edgeList[curr].size();i++){
    if(!vis[edgeList[curr].get(i).destination]&& isCycle(edgeList[curr].get(i).destination, vis,curr)){
     return true;
    }
    else if(vis[edgeList[curr].get(i).destination]&&edgeList[curr].get(i).destination!=parent){
      return true;
    }
  }
 
 return false;


}
public void topSort(){
  boolean vis[]=new boolean[edgeList.length];
      Stack <Integer> s=new Stack<>();
      for(int i=0;i<edgeList.length;i++){
        if(!vis[i]){
       topSortUtil(i,vis,s);}
      }
      while(!s.isEmpty()){
        System.out.println(s.pop()+" ");
      }

}

public void topSortUtil(int curr,boolean vis[],Stack<Integer> s){
vis[curr]=true;
for(int i=0;i<edgeList[curr].size();i++){
  Edge e=edgeList[curr].get(i);
  if(!vis[e.destination]){
    topSortUtil(e.destination,vis,s);}

}
s.push(curr);
}
public void calIndegree(int indegree[]){
  for(int i=0;i<edgeList.length;i++){
for(int j=0;j<edgeList[i].size();j++){
  Edge e=edgeList[i].get(j);
  indegree[e.destination]++;
}

  }
}
public void topSortKahn(){
  int indegree[]=new int[edgeList.length];
  calIndegree(indegree);
  Queue<Integer> q=new LinkedList<>();
  for(int i=0;i<edgeList.length;i++){
   if(indegree[i]==0){
    q.add(i);
   }}
    while(!q.isEmpty()){
      int curr=q.remove();
      
    System.out.print(curr+" ");
    for(int i=0;i<edgeList[curr].size();i++){
      Edge e=edgeList[curr].get(i);
      indegree[e.destination]--;
      if(indegree[e.destination]==0){
        q.add(e.destination);
      }
    }
    }
}
public void targetPath(int s,int t,String path){
if(s==t){
  System.out.println(path+t);
  return ;
}

for(int i=0;i<edgeList[s].size();i++){
  targetPath(edgeList[s].get(i).destination, t, path+s);
}

}
class pair implements Comparable<pair>{
  int n;
  int path;
  pair(int n,int path){
    this.n=n;
    this.path=path;
  }
  @Override
  public int compareTo(pair o) {
    return (this.path)-(o.path);
  };
}
public void dijkstra  (int s){
int dist[]=new int[edgeList.length];
for(int i=0;i<edgeList.length;i++){
  if(i!=s){
    dist[i]=Integer.MAX_VALUE;

  }
}
boolean vis[]=new boolean[edgeList.length];
PriorityQueue<pair> pq=new PriorityQueue<>();
pq.add(new pair(s, 0));
while(!pq.isEmpty()){
  pair curr=pq.remove();
if(!vis[curr.n]){
  vis[curr.n]=true;
  for(int i=0;i<edgeList[curr.n].size();i++){
    Edge e=edgeList[curr.n].get(i);
    int u=e.source;
    int v=e.destination;
    int wt=e.weight;
    if(dist[u]+wt<dist[v]){
      dist[v]=dist[u]+wt;
      pq.add(new pair(v, dist[v]));
    }
  }
}
}

for(int i=0;i<dist.length;i++){
  System.out.print(dist[i]+" ");
}
}

public void bellmanFord(int src){
  int dist[]=new int[edgeList.length];
  for(int i=0;i<edgeList.length;i++){
    if(src!=dist[i]){
      dist[i]=Integer.MAX_VALUE;
    }
  }
  for(int i=0;i<edgeList.length-1;i++){
    for(int j=0;j<edgeList.length;j++){
for(int k=0;k<edgeList[j].size();k++){
  Edge e=edgeList[j].get(k);
  int u=e.source;
  int v=e.destination;
  int wt=e.weight;
  if(dist[u]+wt<dist[v]&&dist[u]!=Integer.MAX_VALUE){
    dist[v]=dist[u]+wt;
  }
}
    }
  }
for(int i=0;i<dist.length;i++){
  System.out.print(dist[i]+" ");
}

}

}
class pair2 implements Comparable<pair>{
  int cost;
  int v;
  pair(int cost,int v){
    this.cost=cost;
    this.v=v;
  }
  @Override
  public int compareTo(pair o) {
    return (this.cost)-(o.cost);
  };
}

void prims(){
  boolean vis[]=new boolean[edgeList.length];
  PriorityQueue<Pair2> pq-new PriorityQueue<>();
pq.add(new pair2(0,0));
int finalCost=0;
while(!pq.isEmpty()){
  pair2 curr=pq.remove();
  if(!vis[curr.v]){
    vis[curr.v]=true;
    finalCost+=curr.cost;
    for(int i=0;i<edgeList[curr.v].size();i++){
      Edge e=edgeList[curr].get(i);
      pq.add(new pair2(e.weight,e.destination));
    }
  }
}
System.out.println("Final Cost :"+finalCost);
}


  
   public static void main(String args[]){
Graph g=new Graph();
g.insert(0, 3, 5);
g.insert(2, 3, 1);
g.insert(3, 1, 1);
g.insert(4, 0, 1);
g.insert(4, 1, 2);
g.insert(5, 0, 1);
g.insert(5, 2, 1);


g.bellmanFord(0);
   }
}

