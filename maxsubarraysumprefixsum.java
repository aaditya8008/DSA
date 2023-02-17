import java.util.*;
public class maxsubarraysumprefixsum{
public static void pairs(int arr[],int n){
int sum=0;
int prefix[]=new int[n];
int maxsum=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        System.out.print(arr[i]+" ");
System.out.println("("+"Sum = "+sum+")" );
System.out.println();
prefix[i]=sum;
}
for(int i=0;i<n;i++){
   System.out.print(prefix[i]+",");

   }
   System.out.println();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter start and end:");
   int s=sc.nextInt();
   int e=sc.nextInt();

   System.out.print(prefix[e]-prefix[s]);

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