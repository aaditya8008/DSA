import java.util.*;
public class fcprimeinrange{
    public static String Prime(int n){
    int count=0;
    for(int i=2;i<Math.sqrt(n);i++){
     if((n%i)==0)
     count++;
    }
    if(count>0)
    return "NPrime";
    else 
    return "Prime";
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
    System.out.println(i+" = "+Prime(i));
}

}

}