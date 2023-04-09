import java.util.*;
public class maxwatercontainer{
    public static int maxwater(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
int height,width,area;
for(int i=0;i<list.size();i++){
    for(int j=i+1;j<list.size();j++){
        width=j-i;
        height=Math.min(list.get(i),list.get(j));
        area=width*height;
        if(area>max)
       max=area;
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