import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        
        int [][] arr = new int[n][n];
        printKnightsTour(arr, r,c, 1);
    }
    
    static int [][] dir = {{-2,1}, {-1,2}, {1,2}, {2,1}, {2,-1},{1,-2},{-1,-2},{-2,-1}};

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        if(upcomingMove == chess.length * chess[0].length){
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        //mark
        chess[r][c] = upcomingMove;
        //calls
        for(int d = 0; d < dir.length; d++){
            int x = r + dir[d][0];
            int y = c + dir[d][1];
            
            if(x >= 0 && y >= 0 && x < chess.length && y < chess[0].length && chess[x][y] == 0)
                printKnightsTour(chess, x,y,upcomingMove+1);
            
        }
        
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