import java.util.*;        //interfaces->class->objects(class.c1)

public class interfaces{    
    public static void main(String args[]){
   queen q=new queen();
   king k=new king();
   rook r=new rook();
   q.moves();
   k.moves();
   r.moves();


    }}

    interface chessplayer{
     void moves();               //public, abstract by default
     
    }
    class queen implements chessplayer{
      public void moves(){       //public should be written
        System.out.println("up,down,left,right,diagonal");
      }
    }

    class rook implements chessplayer{
        public void moves(){       //public should be written
          System.out.println("up,down,left,right");
        }
      }
      
      class king implements chessplayer{
        public void moves(){
            System.out.println("up,down,left,right,diagonal - (by 1 step)");
        }
      }
      