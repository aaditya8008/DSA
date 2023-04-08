import java.util.*;
public class permutationbacktracking{
    public static void findpermutations(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
      for(int i=0;i<str.length();i++)  {
        char curr=str.charAt(i);
        String newstr=str.substring(0,i)+str.substring(i+1); //deleting current element
        findpermutations(newstr,ans+curr);

      }
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
System.out.println("Enter string :");
String str=sc.nextLine();
int i=0;
String ans="";
System.out.println("Sub strings are :");
findpermutations(str,ans);
}

}
