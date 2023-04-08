import java.util.*;
public class backtrackarray{
    public static void back(int arr[],int i){
        if(i==arr.length){
            return;
        }
Scanner sc=new Scanner(System.in);
arr[i]=sc.nextInt();
back(arr,i+1);
arr[i]=arr[i]-2;
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
System.out.println("Enter size:\n");
    int x=sc.nextInt();
    int arr[]=new int[x];
    int i=0;
    back(arr,i);
    for(i=0;i<arr.length;i++){
        System.out.println("Element No "+i+"="+arr[i]);
    }
}

}