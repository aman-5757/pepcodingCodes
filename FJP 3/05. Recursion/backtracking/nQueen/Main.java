import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
    }
    public static boolean isSafe(int r, int c, int [][] chess){
        
        
        //logic
    }
    public static void printNQueens(int[][] chess, String asf, int row) {
        if(row == chess.length){
            System.out.println(asf+".");
            return;
        }
        
        for(int col = 0; col<chess.length; col++){
            if(isSafe()){
                chess[row][col] = 1;
                printNQueens(chess, asf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }
        
        
        
        
    }
}