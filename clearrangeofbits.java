import java.util.*;

public class clearrangeofbits{     
     public static int clear(int n){
        Scanner sc=new Scanner(System.in);    
     int i=sc.nextInt();
     int j=sc.nextInt();

       int a=(~0)<<(j+1);         //11000
       int b=(1<<i)-1;   //1<<i=2rays topower i, 2-1=01,//2raisetopower 2 -2=011
return n&(a|b)    ;       //110011 range 
     }
    public static void main(String args[]){
        int n;
    Scanner sc=new Scanner(System.in);    
     n=sc.nextInt();
     System.out.println(clear(n));
    }
}