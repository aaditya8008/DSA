import java.util.*;
public class rogh{
//safe:

    
    public static int fact(int n){
        if(n==1||n==0)
        return 1;
        return n*fact(n-1);
    }
            public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
            System.out.println("Enter max :");
            int n=sc.nextInt();
            int maxrow=n;
            int maxcol=n;
            int total=(maxrow-1+maxcol-1);
            int tf=fact(total);
            
            int mrf=fact(maxrow-1);
            
            int mrc=fact(maxcol-1);
            
            System.out.println("grid ways :"+tf/(mrf*mrc));
        }
            }
            