import java.util.*;

public class rogh{     
     public static int clear(int n){
        Scanner sc=new Scanner(System.in);  
        int i=sc.nextInt();
        
        return (n&(~(0)<<i));     //or acn use -1
                                  //00000=111111
     }
    public static void main(String args[]){
        int n;
    Scanner sc=new Scanner(System.in);    
     n=sc.nextInt();
     System.out.println(clear(n));
    }
}
