import java.util.*;
public class new {
static class node{
node children[]=new node[26];
boolean end=false;
node(){
for(int i=0;i<children.length;i++){
    children[i]=null;
}
}
}
static node root=new node();
static void insert(String word){
node curr=root;
for(int i=0;i<word.length();i++){
int idx=word.charAt(i)-'a';
if(curr.children[i]==null){
    curr.children[i]=new node();
}
curr=curr.children[idx];


}
curr.end=true;

}

static boolean search(String word){
node curr=root;
for(int i=0;i<word.length();i++){
int idx=word.charAt(i)-'a';
if(curr.children[i]==null){
    return false;
}
curr=curr.children[idx];
}
System.out.println("Found : "+(char)word.charAt(i)-'a');
return true;
}
public static void main(String args[]){
String str[]= { "the", "a", "there", "their", "any", "thee" };

for(int i=0;i<str.length;i++){
    insert(str[i]);
}
search("there");



}

}
