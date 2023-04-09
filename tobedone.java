import java.util.*;
public class rogh{
    public static boolean issafe(int board[][],int r,int c,int digit){
        //column
        for(int i=0;i<=8;i++){
            if(board[i][c]==digit){
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++){
            if(board[r][j]==digit){
                return false;
            }
        }
        //grid
        int sr=(r/3)*3;
        int sc=(c/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
               if(board[i][j]==digit) 
               return false;
            }
        }
        return true;
    }
    public static boolean sudoku(int board[][],int r,int c){
        //basecase
        if(r==9&&c==9)
        return true;
        else if(r==9)
        return false;
        
        //recursion
        int nextrow=r,nextcol=c=1;
        if(c+1==9){
         nextrow=r+1;
         nextcol=0;

        }
        if(board[r][c]!=0){
           return  sudoku(board,nextrow,nextcol);
        }
      for(int i=1;i<=9;i++){
if(issafe(board,r,c,i)){
board[r][c]=i;
if(sudoku(board,nextrow,nextcol))
return true;
}
board[r][c]=0;
      }
      return false;
    }
    public static void printsudoku(int board[][]){
for(int i=0;i<9;i++){
    for(int j=0;j<9;j++){
        System.out.println(board[i][j]+" ");
    }
    System.out.println();
}
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter size :");
    int n=sc.nextInt();
    int board[][]=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        board[i][j]=sc.nextInt();
        }
        
    }
    if(sudoku(board,0,0)){
        System.out.println("Solution exists");
        printsudoku(board);
    }
else{
    System.out.println("Solution doesn't exists");
}
}}