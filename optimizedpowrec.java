import java.util.*;

import javax.print.attribute.standard.PageRanges;
 public class optimizedpowrec{
  public static int power(int x,int n){
    if(n==0)
    return x;
    int halfpower=power(x,n/2); 
    int halfpwsq=halfpower*halfpower;
    if(n%2!=0)
   halfpwsq=  2*halfpwsq;
return halfpwsq;

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

 