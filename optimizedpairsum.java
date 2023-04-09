import java.util.*;
public class optimizedpairsum{
    public static boolean pairsum(ArrayList<Integer> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Target:");
        int target =sc.nextInt();
        int left=0;
        int right=list.size()-1;
while(left<right){
int sum=list.get(left)+list.get(right);
if(sum==target)
return true;

else if(sum>target)
right--;
else
left++;

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