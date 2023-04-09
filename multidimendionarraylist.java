import java.util.*;
public class multidimendionarraylist{
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
ArrayList<Integer> list1=new ArrayList<>();
ArrayList<Integer> list2=new ArrayList<>();
ArrayList<Integer> list3=new ArrayList<>();
mainlist.add(list1);
mainlist.add(list2);
mainlist.add(list3);
System.out.println("List 1 :");
for(int i=0;i<x;i++){
    list1.add(sc.nextInt());
}
System.out.println("List 2 :");
for(int i=0;i<x;i++){
    list2.add(sc.nextInt());
}
System.out.println("List 3 :");
for(int i=0;i<x;i++){
    list3.add(sc.nextInt());
}
for(int i=0;i<mainlist.size();i++){
ArrayList<Integer> list=mainlist.get(i);
for(int j=0;j<list.size();j++){
    System.out.print(list.get(j)+" ");

}
System.out.println();

}



}


}