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
    //mark
    //calls
    //unmark
    
    
    
    // public static void floodfill(int[][] maze, int sr, int sc, String ans) {
    //     if(sr == maze.length-1 && sc == maze[0].length-1){
    //         System.out.println(ans);
    //         return;
    //     }
        
    //     //mark
    //     maze[sr][sc] = 1;
        
    //     //calls{top, left, down, right}
    //     if(sr - 1 >= 0 && maze[sr-1][sc] == 0)
    //         floodfill(maze, sr-1, sc , ans +"t");
    //     if(sc - 1 >= 0 && maze[sr][sc-1] == 0)
    //         floodfill(maze, sr, sc-1 , ans +"l");
    //     if(sr + 1 < maze.length && maze[sr+1][sc] == 0)
    //         floodfill(maze, sr+1, sc , ans +"d");
    //     if(sc + 1 < maze[0].length && maze[sr][sc+1] == 0)
    //         floodfill(maze, sr, sc+1 , ans +"r");
        
    //     //unmark
    //     maze[sr][sc] = 0;
        

        
    // }
    
     public static void floodfill(int[][] maze, int sr, int sc, String ans) {
        if(sr < 0 || sc < 0 || sr>= maze.length || sc >= maze[0].length || maze[sr][sc] == 1)
            return;
            
        if(sr == maze.length-1 && sc == maze[0].length-1){
            System.out.println(ans);
            return;
        }
        
        //mark
        maze[sr][sc] = 1;
        
        //calls{top, left, down, right}
            floodfill(maze, sr-1, sc , ans +"t");
            floodfill(maze, sr, sc-1 , ans +"l");
            floodfill(maze, sr+1, sc , ans +"d");
            floodfill(maze, sr, sc+1 , ans +"r");
        
        //unmark
        maze[sr][sc] = 0;
        

        
    }
}
