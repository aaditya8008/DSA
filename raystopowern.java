import java.util.*;
 public class raystopowern{
  public static int power(int x,int n){
    if(n==1)
    return x;
    else 
    return (x*power(x,n-1));

    
  }
public static void main(String args[]){
 int n;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter power: ");
 n=sc.nextInt();
 System.out.println("Enter number: ");
 int x=sc.nextInt();

 System.out.println(power(x,n));
 }}

 