import java.util.*;

public class raystopower2bin{     
     public static boolean clear(int n){
       
return (n&(n-1))==0;                 //even&previousodd==0
     }
    public static void main(String args[]){
        int n;
    Scanner sc=new Scanner(System.in);    
     n=sc.nextInt();
     System.out.println(clear(n));
    }
}
