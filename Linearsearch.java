import java.util.*;
public class Linearsearch{
    public static int Linear(int arr[],int n){
        System.out.println("Enter Key:");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
     for(int i=0;i<n;i++){
       
        if(arr[i]==key){
            return i;
        }
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
    System.out.println(Linear(arr,n));

    }
}