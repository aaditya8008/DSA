import java.util.*;
public class gridways{
//safe:

    
    public static int gridways(int r,int c,int maxrow,int maxcol){       
        if(r==maxrow-1&&c==maxcol-1){  //we are at last
            return 1;
        }
        else if(r==maxrow||c==maxrow){
            return 0;
        }
                int w1=gridways(r+1,c,maxrow,maxcol); //increasing row
                int w2=gridways(r,c+1,maxrow,maxcol); //increasing column
                return w1+w2;
                }
            
        
            
            //main()
            public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
            System.out.println("Enter max :");
            int n=sc.nextInt();
            int maxrow=n;
            int maxcol=n;
            System.out.println(gridways(0,0,maxrow,maxcol));
        }
            }
            