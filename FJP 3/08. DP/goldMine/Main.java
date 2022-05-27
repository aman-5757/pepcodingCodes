import java.io.*;
import java.util.*;

public class Main {

    public static int goldMine(int i, int j, int [][] grid , int [][] dp){
        if ( i >= grid.length || i < 0 || j >= grid[0].length || j<0)
            return 0;
        
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        int op1 = goldMine(i-1, j+1, grid, dp);
        int op2 = goldMine( i , j+1, grid, dp);
        int op3 = goldMine(i+1, j+1, grid, dp);
        
        int max = Math.max(op1, Math.max(op2,op3));
        
        dp[i][j] = max + grid[i][j];
        
        return dp[i][j];
    }
    
    //this code fails
    //  public static int goldMine(int i, int j, int [][] grid ){
    //     if ( i >= grid.length || i < 0 || j >= grid[0].length || j<0)
    //         return 0;
        
       
    //     int op1 = goldMine(i-1, j+1, grid);
    //     int op2 = goldMine( i , j+1, grid);
    //     int op3 = goldMine(i+1, j+1, grid);
        
    //     int max = Math.max(op1, Math.max(op2,op3));
        
    //   max = max + grid[i][j];
        
    //     return max;
    // }
    
    
    
    public static int goldMineTab(int [][] grid, int [][]dp){
        int n = grid.length;
        int m = grid[0].length;
        for(int j = m-1; j>= 0; j--){
            for(int i = 0; i<n; i++){
                if(j == m-1){
                    dp[i][j] = grid[i][j];
                }
                else if(i == 0){
                    int op1 = dp[i][j+1];
                    int op2 = dp[i+1][j+1];
                    
                    dp[i][j] = grid[i][j] + Math.max(op1, op2);
                }
                else if(i == n-1){
                    int op1 = dp[i][j+1];
                    int op2 = dp[i-1][j+1];
                    
                    dp[i][j] = grid[i][j] + Math.max(op1, op2);
                }
                else{
                    int op1 = dp[i][j+1];
                    int op2 = dp[i-1][j+1];
                    int op3 = dp[i+1][j+1];
                    
                    dp[i][j]= grid[i][j] + Math.max(op1, Math.max(op2, op3));
                }
            }
        }
        
        int ans = 0;
        for(int i = 0; i<n; i++){
            if(dp[i][0] > ans)
                ans = dp[i][0];
        }
        
        return ans;
    }
    
    
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] grid = new int[n][m];
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                grid[i][j] = scn.nextInt();
            }
        }
        
        int [][] dp =  new int[n][m];
        
        
        // int ans = 0;
        // for(int i = 0; i < n; i++){
        //     int tmpAns = goldMine(i,0,grid, dp);
        //     if(tmpAns > ans){
        //         ans = tmpAns;
        //     }
        // }
        int ans = goldMineTab(grid, dp);
        System.out.println(ans);
        
        
    }

}