import java.util.*;
public class pairsum{
    public static void pairsum(ArrayList<Integer> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Target:");
        int target =sc.nextInt();
for(int i=0;i<list.size();i++){
    for(int j=i+1;j<list.size();j++){
      if((list.get(i)+list.get(j))==target)
      System.out.println(list.get(i)+"+"+list.get(j));


    }
  
}
    }
    
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter size:");
int x=sc.nextInt();
ArrayList<Integer> list=new ArrayList<>();
System.out.println("Enter Data:");
for(int i=0;i<x;i++){
    list.add(sc.nextInt());
}
pairsum(list);

}
}