import java.util.*;
public class probabilityqueeenbacktrack{
    public static void nqueens(char board[][],int r){       //row
       if(r==board.length){
        print(board);
        return;
       }
        for(int j=0;j<board.length;j++){
        board[r][j]='Q';
        nqueens(board,r+1);
        board[r][j]='.';
       }

    }
    public static void print(char board [][]){
        System.out.print("Chess Board :\n");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
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
