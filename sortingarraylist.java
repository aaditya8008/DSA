import java.util.*;
public class sortingarraylist{
    public static void swap(ArrayList<Integer> list,int i,int j){
int temp=list.get(i);
list.set(i,list.get(j));
list.set(j,temp);
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
ArrayList <Integer> list=new ArrayList<>();

for(int i=0;i<x;i++){
list.add(sc.nextInt());
}
int i=sc.nextInt(),j=sc.nextInt();
swap(list,i,j);
System.out.println(list);
Collections.sort(list);          //sort
System.out.println(list);
Collections.sort(list,Collections.reverseOrder());   //reverse sort        //sort
System.out.println(list);
}

}