import java.util.ArrayList;
import java.util.*;
public class swaparraylist{
    public static void swap(ArrayList<Integer> list,int i,int j){
        int temp;
temp=list.get(i);
list.set(i,list.get(j));
list.set(j,temp);
System.out.println(list);
    }
public static void main(String args[]){
ArrayList<Integer> list=new ArrayList<>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size:");
int n=sc.nextInt();
System.out.println("Enter Elements:");
for(int i=0;i<n;i++){
    list.add(sc.nextInt());
}System.out.println("Enter indexes :");
int i=sc.nextInt();
int j=sc.nextInt();
swap(list,i,j);
}
}
