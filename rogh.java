import java.util.*;
public class rogh{
    public static int linear(int arr[],int n){
        int key;
        Scanner sc=new Scanner(System.in);
        key=sc.nextInt();
        for(int i=0;i<n;i++){
            if(key==arr[i])
            return i;

        }
        return -1;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter Size");
    n=sc.nextInt();
    int arr[]= new int[n];
    
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    
    System.out.println("INDEX :"+linear(arr,n));

    }
}