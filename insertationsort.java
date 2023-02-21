import java.util.*;
public class insertationsort{
    public static void insertationsort(int arr[],int n){
        
    for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
        while(prev>=0&&arr[prev]>curr){   //finding correct position to insert
          arr[prev+1]=arr[prev] ;
          prev--;
        }
        arr[prev+1]=curr;
    }
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
