import java.util.*;
public class bubblesort{
    public static void bubblesort(int arr[],int n){
        int temp;
    for(int i=0;i<n;i++){
        for(int j=0;j<n-1-i;j++){           //last not taken as comp b/w 2nd last and last
         if(arr[j]>arr[j+1]){
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
         }

        }
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
     bubblesort(arr,n);
    }
}
