import java.util.*;
 public class tilingproblem{
  public static int totalways(int n){
    if(n==0||n==1)
    return 1;
   int v=totalways(n-1);
   int h=totalways(n-2);
return (v+h);

  }
public static void main(String args[]){
 int n;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter number: ");
 n=sc.nextInt();
 System.out.println("Ways = "+totalways(n));
 }}

 