 import java.util.*;
 public class rogh{
  public static int disp(int n){
   

    if(n==1||n==0)
    return 1;
    return(disp(n-1)+disp(n-2));
    
  }
public static void main(String args[]){
 int n;
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 System.out.println(disp(n));
 }}

 