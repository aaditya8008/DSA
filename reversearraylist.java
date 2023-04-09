import java.util.ArrayList;
import java.util.*;
public class reversearraylist{
public static void main(String args[]){
ArrayList<Integer> list=new ArrayList<>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size:");
int n=sc.nextInt();
System.out.println("Enter Elements:");
for(int i=0;i<n;i++){
    list.add(sc.nextInt());
}
System.out.println("Reversed:");
for(int i=list.size()-1;i>=0;i--){
    System.out.println(list.get(i));
}

}
}
