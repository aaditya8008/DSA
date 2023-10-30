import java.util.*;
public class rogh{
public static class node{
    int data;
    node next;
    node(int i){
        data=i;
        next=null;
    }
};
public static node top;
public static void push(int i){
    node n=new node(i);
    if(top==null){
        top=n;
    }
    else{
      n.next=top;
      top=n;
    }
}
public static int pop(){
    
    if(top!=null){
        int x=top.data;
        top=top.next;
        return x;
    }
    else{
        System.out.println("Empty");
        return -1;
    }
}
public static void show(){
    node n=top;
    while(n!=null){
        System.out.print("->"+n.data);
        n=n.next;
    }
    System.out.println();
}
public static void main(String args[]){
    rogh stack=new rogh();
    for(int i=0;i<10;i++){
        stack.push(i);
    }
    stack.pop();
    stack.show();
}



}