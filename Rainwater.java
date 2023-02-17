import java.util.*;
public class Rainwater{
public static void rainwater(int arr[],int n){
int width=1,Totalwater=0,trappedw=0;
int lmax[]=new int[n];
int rmax[]=new int[n];
lmax[0]=arr[0];
rmax[n-1]=arr[n-1];
for(int i=1;i<n;i++){
lmax[i]=Math.max(arr[i],lmax[i-1]);
}
for(int i=n-2;i>=0;i--){
    rmax[i]=Math.max(arr[i],rmax[i+1]);
}
for(int i=0;i<n;i++){
int waterlevel=Math.min(rmax[i],lmax[i]);
trappedw+=(waterlevel-arr[i])*width;}        //arr=height

System.out.println("Trapped water ="+trappedw);


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
   rainwater(arr,n);
}}