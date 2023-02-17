import java.util.*;
public class kadanesum{
public static void pairs(int arr[],int n){
int sum=0;
int maxsum=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
sum+=arr[i];
if(sum<0)
sum=0;
System.out.println("("+"Sum = "+sum+")" );
maxsum=Math.max(sum,maxsum);
System.out.println();
}

System.out.println("Max sum = "+maxsum);

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