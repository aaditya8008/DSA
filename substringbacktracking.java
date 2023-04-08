import java.util.*;
public class substringbacktracking{
    public static void subsets(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0)   //not necessary just to show null element
            System.out.println("NULL");
            else
            System.out.println(ans);
            return;
        }

        //backtracking part
       subsets(str,ans+str.charAt(i),i+1); //yes next element selected to add up

       subsets(str,ans,i+1);              //no
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
System.out.println("Enter string :");
String str=sc.nextLine();
int i=0;
String ans="";
System.out.println("Sub strings are :");
subsets(str,ans,i);
}

}
