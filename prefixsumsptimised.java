import java.util.*;
public class prefixsumsptimised{
public static void pairs(int arr[],int n){
int sum=0,maxsum=Integer.MIN_VALUE;
int prefix[]=new int[arr.length];
prefix[0]=arr[0];
for(int i=1;i<arr.length;i++){
        prefix[i]=prefix[i-1]+arr[i];
}
for(int i=0;i<n;i++){
   System.out.print(prefix[i]+",");
}
for(int i=0;i<n;i++){
    for(int j=i;j<n;j++){
sum=prefix[j]-prefix[i];
}System.out.println("Sum = "+sum);
System.out.println();
if(sum>maxsum)
maxsum=sum;
sum=0;
}
System.out.println("MAX SUM = "+maxsum);
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