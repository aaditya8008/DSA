import java.util.*;
public class Maxsubarraysumbruteforce{
public static void pairs(int arr[],int n){
int sum=0;
int maxsum=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
for(int j=i;j<arr.length;j++){
    for(int s=i;s<=j;s++){
        sum+=arr[s];
        System.out.print(arr[s]+" ");
}
System.out.println("("+"Sum = "+sum+")" );
if(sum>maxsum)
maxsum=sum;
sum=0;
System.out.println();

}


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