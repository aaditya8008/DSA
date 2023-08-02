import java.util.*;

public class largestbst {

    static class node {
        int data;
        node right;
        node left;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
public static int maxbst=0;
    static class info{
    boolean isbst;
    int size;
    int min;
    int max;

    info(boolean isbst,int size,int min,int max){
        this.isbst=isbst;
        this.size=size;
        this.min=min;
        this.max=max;
    }

    }

    public static info largestbst(node root){
     if(root==null)
     return new info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
     
     info leftinfo=largestbst(root.left);
     info rightinfo=largestbst(root.right);
     int size=leftinfo.size+rightinfo.size+1;
     int min=Math.min(root.data,Math.min(leftinfo.min,rightinfo.min));
     int max=Math.max(root.data,Math.max(leftinfo.max,rightinfo.max));
    if(root.data<=leftinfo.max||root.data>=rightinfo.min){
        return new info(false,size,min,max);
    }
if(leftinfo.isbst&&rightinfo.isbst){
    maxbst=Math.max(maxbst,size);
   return  new info(true,size,min,max);
}
return new info(false,size,min,max);
    
    }
   

    

    
    public static void inorder(node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }
    

    public static void main(String args[]) {
         node root = new node(4);
        root.left = new node(2);
        root.right = new node(5);
        root.left.left = new node(1);
        root.left.right = new node(3);
        root.right.right = new node(6);
        inorder(root);
       
       info infobst=largestbst(root);
       System.out.println("Largest Bst : "+maxbst);

    }

}