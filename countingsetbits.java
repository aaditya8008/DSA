import java.util.*;

public class countingsetbits{     
     public static int clear(int n){
        int count=0;
       while(n!=0){
       if((n&(1<<0))!=0)
       count++;

       n=n>>1;
       }
return count;                 //even&previousodd==0
     }
    public static void main(String args[]){
        int n;
    Scanner sc=new Scanner(System.in);    
     n=sc.nextInt();
     System.out.println(clear(n));
    }
}
