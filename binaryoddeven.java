import java.util.*;

public class binaryoddeven{     //1=0,0=1 then+1 ,1=-ve,0=+ve
     public static void oddeven(int n){
     if((n&1)==0)
     System.out.println("Even");
     else
     System.out.println("odd");
     }
    public static void main(String args[]){
        int n;
    Scanner sc=new Scanner(System.in);    
     n=sc.nextInt();
    oddeven(n);
    }
}
