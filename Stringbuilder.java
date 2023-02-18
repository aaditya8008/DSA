import java.util.*;
public class Stringbuilder{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    StringBuilder str=new StringBuilder("");
    for(char ch='A';ch<='Z';ch++){
        str.append(ch);
    }
    System.out.println(str);
    }
}
