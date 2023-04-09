import java.util.*;
public class multidimarraylist{
    public static void swap(ArrayList<Integer> list,int i,int j){
int temp=list.get(i);
list.set(i,list.get(j));
list.set(j,temp);
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter size:");
int x=sc.nextInt();
ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
ArrayList<Integer> list=new ArrayList();
System.out.println("Array list 1:");
for(int i=0;i<x;i++){
list.add(sc.nextInt());
}

mainlist.add(list);
System.out.println("Array list 2:");
ArrayList<Integer> list2=new ArrayList();
for(int i=0;i<x;i++){
    list2.add(sc.nextInt());
}
mainlist.add(list2);
System.out.println(mainlist);
for(int i=0;i<mainlist.size();i++){
    ArrayList<Integer> currlist= mainlist.get(i);
    for(int j=0;j<currlist.size();j++){
        System.out.print(currlist.get(j)+" ");
    }
    System.out.println();
}
}


}