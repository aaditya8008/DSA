import java.util.*;
 public class firstoccurancerec{
  public static boolean sorted(int arr[],int i){
    int key=5;
    if(arr[i]==key){
      System.out.println("Element at : "+i);
    return true;
  }
if(i==arr.length-1)
return false;
   
return sorted(arr,i+1);

    
  }
public static void main(String args[]){
 int n;
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 int arr[]=new int[n];
 for(int i=0;i<n;i++){
  arr[i]=sc.nextInt();
 }
 int i=0;
 System.out.println(sorted(arr,i));
 }}

 