import java.io.*;
import java.util.*;

public class Main {
    public static int [][] dir = {{-2,1}, {-1,2}, {1,2}, {2,1}, {2,-1}, {1,-2}, {-1,-2} ,{-2,-1}}; 

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        int [][] chess = new int[n][n];

        printKnightsTour(chess,r,c,);
        // System.out.println("MY TEST");
        // displayBoard(chess);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        //out of range
        if(r >= chess.length || c >= chess.length || r < 0 || c < 0 || chess[r][c] != 0 ){
            return;
        }

        //destination
        if(upcomingMove == chess.length * chess[0].length){
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        //mark
        chess[r][c] = upcomingMove;
        //calls
        for(int d = 0; d<dir.length; d++){
            int i = r + dir[d][0];
            int j = c + dir[d][1];
            
            printKnightsTour(chess, i, j, upcomingMove+1);
            printKnightsTour_M2(chess, i, j, upcomingMove+1);
        }
        //unmark
        chess[r][c] = 0;
    }


     public static void printKnightsTour_M2(int[][] chess, int r, int c, int upcomingMove) {
        //out of range
        if(r >= chess.length || c >= chess.length || r < 0 || c < 0 || chess[r][c] != 0 ){
            return;
        }

        //destination
        if(upcomingMove == chess.length * chess[0].length){
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        //mark
        chess[r][c] = upcomingMove;
        //calls
        printKnightsTour_M2(chess, r-2, c + 1, upcomingMove+1 );
        printKnightsTour_M2(chess, r-1, c + 2, upcomingMove+1 );
        printKnightsTour_M2(chess, r+1, c + 2, upcomingMove+1 );
        printKnightsTour_M2(chess, r+2, c + 1, upcomingMove+1 );
        printKnightsTour_M2(chess, r+2, c - 1, upcomingMove+1 );
        printKnightsTour_M2(chess, r+1, c - 2, upcomingMove+1 );
        printKnightsTour_M2(chess, r-1, c - 2, upcomingMove+1 );
        printKnightsTour_M2(chess, r-2, c - 1, upcomingMove+1 );

        //unmark
        chess[r][c] = 0;
    }



    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}