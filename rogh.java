import java.util.*;
public class rogh{
 public static int totalways(int n){
   if(n==1||n==2)
   return n;
  int v=totalways(n-1);
  int h=totalways(n-2);
return (v*((n-1)*h));

 }
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number: ");
n=sc.nextInt();
System.out.println("Ways = "+totalways(n));
}}

