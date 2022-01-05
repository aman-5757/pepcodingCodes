import java.io.*;
import java.util.*;

public class Main {
    
    static int [][] dir = {{-2,1}, {-1,2}, {1,2}, {2,1}, {2,-1}, {1,-2}, {-1,-2}, {-2,-1}};
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int [][] chess = new int[n][n];
        
        //starting pos
        int r = scn.nextInt();
        int c = scn.nextInt();
        
        printKnightsTour(chess, r, c, 1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        //bahar chala gya hai kya?
        if(r >= chess.length || r < 0 || c < 0 || c >= chess[0].length || chess[r][c] != 0 ){
            return;
        }
        //answer mil gya hai?
        if(upcomingMove == chess.length * chess.length){
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        //mark
        chess[r][c] = upcomingMove;
        
        // calls
        for(int d = 0 ; d<dir.length; d++){
            int x = r + dir[d][0];
            int y = c + dir[d][1];
            printKnightsTour(chess, x, y, upcomingMove+1);
        }
        
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