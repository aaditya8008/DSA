import java.util.*;
public class rogh{
    public static boolean pairsum2(ArrayList<Integer> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Target:");
        int target =sc.nextInt();
        int n=list.size();
        
        int bp=-1;         //breaking point
        for(int i=0;i<list.size();i++){

            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int left=bp+1; //smallest
        int right=bp;  //largest
while(left!=right){
int sum=list.get(left)+list.get(right);
if(sum==target)
return true;

else if(sum<target)
left=(left+1)%n;
else
right=(n+right-1)%n;



}
return false;
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
System.out.println(pairsum(list));

}
}