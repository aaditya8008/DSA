import java.util.*;

public class lcabt {

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

    static class binarytree {
        static int idx = -1;

        static node buildnode(int nodes[]) {
            idx++;
            node newnode = new node(nodes[idx]);
            newnode.left = buildnode(nodes);
            newnode.right = buildnode(nodes);
            return newnode;
        }

      

      

     
    }
    static boolean getpath(node root,int n,ArrayList<node> path){
            if(root==null)
            return false;
            path.add(root);
            if(root.data==n)
            return true;
boolean left=getpath(root.left ,n,path);
boolean rigth=getpath(root.right,n,path);

if(left||right)
return true;
path.remove(path.size()-1);
return false;
         }
      static node lca(node root,int n1,int n2){
ArrayList <node> path1 =new ArrayList<>();
ArrayList <node> path2 =new ArrayList<>();
getpath(root,n1,path1);
getpath(root,n2,path2);
int i=0;
for(i=0;i<path1.size()&&i<path2.size();i++)
{
    if(path1.get(i)!=path2.get(i))
    break;
}
node lca=path1.get(i-1);
return lca;

        }

    public static void main(String args[]) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);

        binarytree tree = new binarytree();
        node n = root;
       
        n = root;
        int n1=4,n2=5;
        System.out.println(lca(n,n1,n2).data);
    }

}