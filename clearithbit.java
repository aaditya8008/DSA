import java.util.*;

public class clearithbit{     //1=0,0=1 
     public static int clear(int n){
        Scanner sc=new Scanner(System.in);  
        int i=sc.nextInt();
        
        return (n&(~(1<<i)));
     }
    public static void main(String args[]){
        int n;
    Scanner sc=new Scanner(System.in);    
     n=sc.nextInt();
     System.out.println(clear(n));
    }
}
