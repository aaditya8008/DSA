import java.util.*;
public class invertedpyramid{
    public static void invert(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
    System.out.print(" ");
     
        }
        for(int c=0;c<i;c++){
            System.out.print("*");
        }
        System.out.println();
    }

    }
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
invert(n);


}

}