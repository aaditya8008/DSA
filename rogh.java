import java.util.*;

public class rogh{
static class node{
int data;
node left;
node right;
node(int data){
this.data=data;
this.right=null;
this.left=null;
}
}

static class binarytree{
static int idx=-1;
static node buildtree(int nodes[]){
idx++;
if(nodes[idx]==-1){
  return null;
}
node newnode=new node(nodes[idx]);
newnode.left=buildtree(nodes);
newnode.right=buildtree(nodes);
return newnode;
}

static void prefix(node root){
node n=root;
if(n==null){
  return ;
}
System.out.println(n.data);
prefix(n.left);
prefix(n.right);

}

static int count(node root){
node n=root;
if(n==null){
  return 0;
}
int left=count(n.left);
int right=count(n.right);
return left+right+1;

}
static int height(node root){
node n=root;
if(n==null){
  return 0;
}
int left=height(n.left);
int right=height(n.right);
return Math.max(left, right)+1;

}


}


  public static void main(String args[]){
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    binarytree tree=new binarytree();
    node root=tree.buildtree(nodes);
    tree.prefix(root);
    System.out.println("Count : "+tree.count(root));
    System.out.println("Height : "+tree.height(root));
  }



}