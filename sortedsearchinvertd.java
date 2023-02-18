import java.util.*;
public class rogh{
    public static boolean staircasesearch(int arr[][],int key){
    int r=0,c=arr[0].length-1;
    while(r<arr[0].length&&c>=0){
    if(arr[r][c]==key){
    System.out.println("Found key at"+r+","+c);
    return true;}
    else if(key<arr[r][c])
     c--;
     else if(key>arr[r][c])
     r++;
    }



return false;
    }
    public static void main(String args[]){
    int arr[][]=new int[3][3];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        arr[i][j]=sc.nextInt();
     }
    }
    System.out.println("Enter key\n");

    int key=sc.nextInt();
    System.out.println(staircasesearch(arr,key));

        
    }
}
