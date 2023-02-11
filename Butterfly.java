import java.util.*;
public class Butterfly{
    public static void butter(int n){
    for(int i=0;i<=n;i++){
        for(int c=0;c<=i;c++){
            System.out.print("*");
        }
        for(int j=0;j<n-i;j++){
            System.out.print("  ");
             
                }
                
                for(int c=0;c<=i;c++){
                    System.out.print("*");
                }
                System.out.println();
    }

    
    for(int i=0;i<=n;i++){
        for(int j=n-i;j>=0;j--){
            System.out.print("*");
        }
        for(int j=0;j<i;j++){
            System.out.print("  ");
             
                }
                
                for(int c=n-i;c>=0;c--){
                    System.out.print("*");
                }
                System.out.println();
    }}


    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    butter(n);

    }
}