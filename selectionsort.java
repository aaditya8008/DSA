import java.util.*;
public class selectionsort{
    public static void insertationsort(int arr[],int n){
        int min;
        for(int i=0;i<arr.length-1;i++){
            min=i;
        for(int j=i+1;j<arr.length;j++){
         if(arr[min]>arr[j])
         min=j;
         }
         int temp=arr[min];
         arr[min]=arr[i];
         arr[i]=temp;
        
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
