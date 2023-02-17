import java.util.*;
public class rogh{
public static void spiral(int arr[][],int n){
int sr=0,er=n-1,sc=0,ec=n-1;
while(sr<=er&&ec>=sc){
for(int i=sc;i<=ec;i++){
    System.out.print(arr[sr][i]+" ");
}
System.out.println();
for(int i=sr+1;i<=er;i++){
    System.out.print(arr[i][ec]+" ");
}System.out.println();
for(int i=ec-1;i>=sc;i--){
    System.out.print(arr[er][i]+" ");
}System.out.println();
for(int i=er-1;i>sr;i--){
    System.out.print(arr[i][sc]+" ");
}System.out.println();
sr++;ec--;sc++;er--;
}
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