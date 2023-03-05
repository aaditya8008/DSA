import java.util.*;
public class rogh{
 public static int totalways(int arr[],int i,int key){
  if(i==arr.length-1)
  return -1;
   int ar=totalways(arr,i=i+1,key);

  if(ar==-1&&arr[i]==key){
    System.out.println(i+"\n");
  return i;
  
  }
  return ar;
  


 }
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number: ");
n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
  arr[i]=sc.nextInt();
}
int i=0;
int key=sc.nextInt();
System.out.println(totalways(arr,i,key)+"\t");}
}