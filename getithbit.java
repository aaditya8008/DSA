import java.util.*;

public class getithbit{     //00010000&11111000=0
     public static int get(int n){
        Scanner sc=new Scanner(System.in);  
        int i=sc.nextInt();
        if((n&(1<<i))==0){
            return 0;
        }
        else return 1;
     }
    public static void main(String args[]){
        int n;
    Scanner sc=new Scanner(System.in);    
     n=sc.nextInt();
     System.out.println(get(n));
    }
}
