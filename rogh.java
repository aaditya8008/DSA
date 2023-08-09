import java.util.*;
public class rogh {
static class node {
        node arr[] = new node[26];
        boolean end = false;

        node() {
            for (int i = 0; i < 26; i++) {
                arr[i] = null;
            }
        }
    }
public static node root=new node();


public static void insert(String word){
node curr=root;
for(int i=0;i<word.length();i++){
    int idx = word.charAt(i) - 'a';
    if(curr.arr[idx]==null){
        curr.arr[idx]=new node();
    }
    curr=curr.arr[idx];
}
curr.end=true;

}

public static boolean search (String word){
node curr=root;
for(int i=0;i<word.length();i++){
    int idx = word.charAt(i) - 'a';
    if(curr.arr[idx]==null){
       return false;
    }
    curr=curr.arr[idx];
}
return true;

}



public static void main(String args[]){
String words[] = { "the", "a", "there", "their", "any", "thee" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(search("thee"));
          System.out.println(search("thor"));

}

}
