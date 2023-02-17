import java.util.*;
public class rogh{
public static void pairs(int arr[],int n){
int temp;
for(int i=0;i<arr.length;i++){
for(int j=i;j<arr.length;j++){
    for(int s=i;s<=j;s++){
        System.out.print(arr[s]+" ");
    
}

System.out.println();
}

}
}

    
    public static void main(String args[]){
   System.out.println("Enter Size:");
   int n;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();

   }
   pairs(arr,n);
}}