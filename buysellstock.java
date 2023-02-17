import java.util.*;
public class buysellstock{
public static void rainwater(int arr[],int n){
int bp=Integer.MAX_VALUE,mp=0,p=0;
for(int i=0;i<n;i++){
if(bp<arr[i]){
p=arr[i]-bp;        //profit,arr=sp
mp=Math.max(mp,p);}
else if(bp>arr[i])
bp=arr[i];



}
System.out.println("MAX PRICE = "+mp);
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