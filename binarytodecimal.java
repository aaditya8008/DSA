import java.util.*;
public class rogh{
    public static void retrn(int n){
        int sum=0,rem;
        int count=0;
       while(n!=0){
       rem=n%10;
       if(rem!=0)
       sum=sum+rem*(int)Math.pow(2,count);
       
n=n/10;
count++;
       }
        
System.out.println(sum);
  }

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter num :\n");

retrn(10011111);


}

}