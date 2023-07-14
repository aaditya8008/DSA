import java.util.*;

public class twohalvesqueue{
    public static void interleave(Queue<Integer> q){
Queue<Integer> e= new LinkedList<>();
int size=q.size();
for(int i=0;i<size/2;i++){
    e.add(q.remove());

}

while(!e.isEmpty()){
    q.add(e.remove());
    q.add(q.remove());
}

}
public static void main(String args[]){



Queue<Integer> q= new LinkedList<>();
for(int i=1;i<=10;i++){
    q.add(i);
}
interleave(q);
System.out.println(q);



}

}