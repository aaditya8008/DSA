import java.util.*;
public class nqueens{


//safe:
public static boolean issafe(char board[][],int row,int col){
//vertical up
for(int i=row-1;i>=0;i--){
    if(board[i][col]=='Q')
    return false;
}

//left diagonal up (i,j)=(i-1,j-1)
for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
    if(board[i][j]=='Q')
    return false;
}
//right diagonal up (i,j)=(i-1,j+1)
for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
    if(board[i][j]=='Q')
    return false;
}
return true;
}



//nqueens:
    public static void nqueens(char board[][],int r){       //row
       if(r==board.length){
        print(board);
        return;
       }
        for(int j=0;j<board.length;j++){
            if(issafe(board,r,j)){
                board[r][j]='Q';
                nqueens(board,r+1);
                board[r][j]='.';
            }
        
       }

    }



//print:
    public static void print(char board [][]){
        System.out.print("Chess Board :\n");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }



//main()
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
System.out.println("Enter size :");
int n=sc.nextInt();
char board[][]=new char[n][n];
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    board[i][j]='.';
    }
    
}
nqueens(board,0);
}

}
