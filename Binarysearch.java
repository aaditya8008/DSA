import java.security.Key;
import java.util.*;
public class Binarysearch{
    public static int Binary(int arr[],int n){
       int s=0,e=n-1,mid;
       Scanner sc=new Scanner(System.in);
       int Key=sc.nextInt();
       for(int i=s;i<n;i++){
        mid=(s+e)/2;
        if(arr[mid]==Key)
        return mid;
        else if(arr[mid]>Key)
        e=mid-1;
        else if(Key>arr[mid])
         s=mid+1;
       }
       return -1;

    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter size:");
    n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(Binary(arr,n));

    }
}