import java.io.*;
import java.util.*;

public class Main {
    static int [][] dir = {{-1,0}, {0,-1}, {1,0}, {0,1}};
    static String [] dirS = {"t", "l", "d", "r"};

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
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {
        if(sr == maze.length-1 && sc == maze[0].length-1 ){
            System.out.println(asf);
            return;
        }
        //mark
        maze[sr][sc] = 1;

        //calls 
        for(int d = 0 ; d < dir.length ; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if(r < maze.length && r >= 0 && c < maze[0].length && c >= 0 && maze[r][c] != 1){
                floodfill(maze, r,c,asf + dirS[d]);
            }
        }


        //unmark
        maze[sr][sc] = 0;





    }
}
