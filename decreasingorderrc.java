import java.util.*;
 public class decreasingorderrc{
  public static void disp(int n){
    if(n==1){
      System.out.print(n);
    return;
    }
    System.out.print(n+",");
    disp(n-1);
  }
public static void main(String args[]){
 int n;
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 disp(n);
 }}

 