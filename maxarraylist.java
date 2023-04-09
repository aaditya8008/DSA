import java.util.ArrayList;
import java.util.*;
public class maxarraylist{
public static void main(String args[]){
ArrayList<Integer> list=new ArrayList<>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size:");
int n=sc.nextInt();
System.out.println("Enter Elements:");
for(int i=0;i<n;i++){
    list.add(sc.nextInt());
}
int max=Integer.MIN_VALUE;
for(int i=0;i<n;i++){
    if(list.get(i)>max)
    max=list.get(i);
}
System.out.println("MAX ="+max);
}
}
