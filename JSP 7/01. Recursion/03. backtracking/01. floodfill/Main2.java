import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }
    
    // asf -> answer so far
    static int [][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
    static String [] dirName = {"t", "l", "d", "r"};
    
    public static void floodfill(int[][] maze, int sr, int sc, String ans) {
        if(sr == maze.length-1 && sc == maze[0].length-1){
            System.out.println(ans);
            return;
        }
        
        maze[sr][sc] = 1;
        //dir calls
        for(int d = 0; d<dir.length; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            
            if(r >= 0 && r < maze.length && c >= 0 && c < maze[0].length && maze[r][c] == 0){
                floodfill(maze, r, c, ans + dirName[d]);
            }
        }
        
        
        maze[sr][sc] = 0;
    }
}
