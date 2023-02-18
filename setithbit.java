import java.util.*;

public class rogh{     //1=0,0=1 then+1 ,1=-ve,0=+ve
     public static int set(int n){
        Scanner sc=new Scanner(System.in);  
        int i=sc.nextInt();
        
        return (n|(1<<i));
     }
    public static void main(String args[]){
        int n;
    Scanner sc=new Scanner(System.in);    
     n=sc.nextInt();
     System.out.println(set(n));
    }
}
