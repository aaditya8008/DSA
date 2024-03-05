import java.util.Stack;
import java.util.Scanner;

public class rogh2 {
    public static void pushBottom(char data,Stack<Character> S){
    if(S.isEmpty()){
        S.push(data);
        return;
    }
    else{
        char x=S.pop();
        pushBottom(data, S);
        S.push(x);
    }
    }
    public static void rev(Stack<Character> S){
        if(S.isEmpty()){
            return;
        }
        else{
            char x=S.pop();
            rev(S);
            pushBottom(x,S);
        }
    }
    public static void main(String args[]) {
       Stack<Character> S=new Stack<>();
       String s="Aaditya";
   for(int i=0;i<s.length();i++){
    S.push(s.charAt(i));
   }
  rev(S);
   System.out.println(S);

}}