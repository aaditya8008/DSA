import java.util.*;
public class optimizedmaxwater{
    public static int maxwater(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
int left=0,height,width,area;
int right=list.size()-1;
    while(left< right ){
width=right-left;
height=Math.min(list.get(left),list.get(right));
area=width*height;
max=Math.max(max,area);
if(list.get(left)<list.get(right)){
    left++;
}

else{
    
    right--;
}

    }
    return max;
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
int max=maxwater(list);
System.out.println("Water Stored :"+max);
}
}