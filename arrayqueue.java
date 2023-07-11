import java.util.Scanner;

import java.util.*;
public class arrayqueue{
static class Queue{
static int arr[];
static int size;
static int rear;
static int front;
Queue(int n){
    arr=new int[n];
    size=n;
    rear=-1;
    front=-1;
}
public static boolean isEmpty(){
if(rear==-1)
return true;
return false;
}
public static void add(int data){
if(rear==arr.length-1){
    System.out.println("Full");
    return ;
}
if(isEmpty()){
    rear++;
    front++;
    arr[rear]=data;
}
else{
rear++;
arr[rear]=data;
}

}
public static int rem(){
if(!isEmpty()){
    int x=arr[front];
for(int i=0;i<arr.length-1;i++){
    arr[i]=arr[i+1];
}
rear--;
return x;

}
else{
    System.out.println("Empty");
    return -1;
}

}
public static void print(){
int x=front;
System.out.println("Data :\n");
for(int i=x;i<arr.length;i++){
    System.out.println(arr[i]);
}

}
public static int peek(){
    if(isEmpty()){
        System.out.println("Empty");
        return -1;

    }
    return arr[0];

}


}

public static void main(String args[]){
    System.out.println("Enter Size :\n");
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
Queue q=new Queue(size);
 System.out.println("Enter Data :\n");
 for(int i=0;i<size;i++){
    q.add(sc.nextInt());
 }
q.print();
q.rem();
q.print();
q.add(10);
q.print();
}

}