import java.security.Key;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
public class HashMapCode{
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
     
        private int n;
        private int N;
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked")
        public HashMap(){
            N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int hasFunction(K key){
            int hc=key.hashCode();
           return Math.abs(hc)%N;

        }
        public int SearchInLL(K key,int bi){
            LinkedList<Node> ll=buckets[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;

        }
        @SuppressWarnings("unchecked")
        public void rehash(){
            LinkedList<Node> oldBuck[]=buckets;
            buckets=new LinkedList[2*N];
            N=2*N;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
            for(int i=0;i<oldBuck.length;i++){
              LinkedList<Node> ll=oldBuck[i];
              for(int j=0;i<ll.size();j++){
Node node=ll.remove();
put(node.key, node.value);
              }
            }
        }
        public void put(K key,V value){
            int bi=hasFunction(key);
            int di =SearchInLL(key,bi);
            if(di!=-1){
               Node nl=buckets[bi].get(di);
               nl.value=value;
               nl.key=key;
            }
            else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double  lambda=(double)n/N;
            if(lambda>2.0){
                rehash();
                
            }
        }
        public boolean containsKey(K key){
            int bi=hasFunction(key);
            int di =SearchInLL(key,bi);
            if(di!=-1){
               return true;
            }
            else{
              return false;
            }
        }
        public V remove(K key){
            int bi=hasFunction(key);
            int di =SearchInLL(key,bi);
            if(di!=-1){
                LinkedList<Node> ll=buckets[bi];
                V num=ll.get(di).value;
                n--;
                ll.remove(ll.get(di));
                return num;
            }
            else{
               return null;
            }
        }
        public V get(K key){
            int bi=hasFunction(key);
            int di =SearchInLL(key,bi);
            if(di!=-1){
                LinkedList<Node> ll=buckets[bi];
                return ll.get(di).value;
            }
            else{
                return null;
            }
        }
        public ArrayList<K> keySet(){
           ArrayList<K> buckK=new ArrayList<>();
for(int i=0;i<buckets.length;i++){
    LinkedList<Node> ll=buckets[i];
    for(Node node:ll){
     buckK.add(node.key);
    }
}
return buckK;
        }

    }
public static void main(String args[]){
HashMap<String,Integer> hm=new HashMap<>();
hm.put("India", 150);
hm.put("China", 100);
hm.put("USA", 50);
ArrayList<String> a=hm.keySet();
System.out.println(a);

}
}