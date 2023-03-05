import java.util.*;
public class friends{
public static int friends(int n){
if(n==1||n==2)
return n;
int single=friends(n-1);
int pairs=((n-1)*friends(n-2));   //out of n n-1 left
return(single+pairs);
}

public static void main(String args[]){
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number: ");
  n=sc.nextInt();
System.out.println("Ways = "+friends(n));


}

}