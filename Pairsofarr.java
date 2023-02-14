import java.security.Key;
import java.util.*;
public class Pairsofarr{
    public static void Binary(int arr[],int n){
       
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            System.out.print("("+arr[i]+","+arr[j]+")");
        }
        System.out.println();
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

    }
}