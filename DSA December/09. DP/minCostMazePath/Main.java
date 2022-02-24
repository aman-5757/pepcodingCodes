import java.io.*;
import java.util.*;

public class Main {

    public static int mazePath(int n, int m,int [][] cost, int [][] dp){
        for(int j = m-1; j>=0; j--){
            for(int i = n-1;  i>=0; i--){
                //last block
                if(i == n-1 && j == m-1){
                    dp[i][j] = cost[i][j];
                }
                //last row
                else if(i == n-1){
                    dp[i][j] = cost[i][j] + dp[i][j+1];
                }
                //last col
                else if(j == m-1){
                    dp[i][j] = cost[i][j] + dp[i+1][j];
                }
                else{
                    int min = Math.min( dp[i+1][j],  dp[i][j+1]);
                    dp[i][j] = min + cost[i][j];
                }
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] cost = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                cost[i][j] = scn.nextInt();
            }
        }
        int [][] dp = new int[n][m];

        int ans = mazePath( n,m, cost, dp );

        System.out.println(ans);
    }

}