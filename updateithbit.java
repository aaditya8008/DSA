import java.util.*;

public class updateithbit{     //1=0,0=1 then+1 ,1=-ve,0=+ve
     public static int update(int n,int ch){
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter Shift:"); 
        int i=sc.nextInt();
        if(ch==0)
        return (n&(~(1<<i)));
        else if(ch==1)
        return (n|(1<<i));
        else return -1;
     }
    public static void main(String args[]){
        int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number:");    
     n=sc.nextInt();
     System.out.println("Enter number change:"); 
     int ch=sc.nextInt(); 
     System.out.println(update(n,ch));
    }
}
