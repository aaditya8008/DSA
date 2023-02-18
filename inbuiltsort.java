import java.util.*;
import java.util.Collections;;
public class inbuiltsort{
    public static void insertationsort(int arr[],int n){
        Arrays.sort(arr,0,4,Collections.reverseOrder());
         for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
           }
}
    public static void main(String args[]){
        int n;
    Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
     }
     insertationsort(arr,n);
    }
}