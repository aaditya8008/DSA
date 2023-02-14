import java.security.Key;
import java.util.*;
public class reversearr{
    public static void Binary(int arr[],int n){
       int s=0,e=n-1,mid,temp=arr[0];
       Scanner sc=new Scanner(System.in);
      while(s<e){
      temp=arr[s];
      arr[s]=arr[e];
      arr[e]=temp;
      s++;
      e--;
      }

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
    Binary(arr,n);
    for(int i=0;i<n;i++){
    System.out.println(arr[i]);
    }
    }
}