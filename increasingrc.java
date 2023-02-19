import java.util.*;
 public class increasingrc{
  public static void disp(int n){
    if(n==1){
      System.out.print(n+" ");
    return;
    }
    disp(n-1);
    System.out.print(n+" ");
    
  }
public static void main(String args[]){
 int n;
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 disp(n);
 }}

 