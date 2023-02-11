import java.util.*;
public class Binarycoef{
    public static int nfact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact =fact*i;
        }
        return fact;
        }
        public static int rfact(int r){
            int fact=1;
            for(int i=1;i<=r;i++){
                fact =fact*i;
            }
            return fact;
            }
            public static int nrfact(int n,int r){
                int fact=1;
                for(int i=1;i<=n-r;i++){
                    fact =fact*i;
                }
            
                return fact;
                }
                public static void total(int n,int r,int t){
                    float f=n/(r*t);
                    System.out.println(f);
                    }


public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r=sc.nextInt();
total(nfact(n),rfact(r),nrfact(n,r));

}

}