import java.util.*;
public class optdiagonalsum{
public static void spiral(int arr[][],int n){
    int primsum=0,secsum=0;
for(int i=0;i<n;i++){
primsum+=arr[i][i];
secsum+=arr[i][n-1-i];

}
System.out.print(primsum+"\n"+secsum);
}



    
    public static void main(String args[]){
   System.out.println("Enter Size:");
   int n;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   int arr[][]=new int[n][n];
   for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    arr[i][j]=sc.nextInt();

   }}
   spiral(arr,n);
}}