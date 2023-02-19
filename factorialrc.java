import java.util.*;
 public class factorialrc{
  public static int disp(int n){
    if(n==0)
    return 1;
    if(n==1)
    return 1;
    
    return(n*disp(n-1));
    
  }
public static void main(String args[]){
 int n;
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 System.out.println(disp(n));
 }}

 