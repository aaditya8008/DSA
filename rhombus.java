import java.util.*;
public class rhombus{
    public static void butter(int n){
        for(int i=0;i<=n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
             
                }
                
                for(int c=0;c<=n;c++){
                    System.out.print("*");
                }
                


    
    
                System.out.println();
    }}


    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    butter(n);

    }}
