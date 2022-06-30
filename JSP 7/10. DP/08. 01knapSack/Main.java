import java.io.*;
import java.util.*;

public class Main {
    public static int solve(int [] val, int [] wt, int tar){
        int [][] dp = new int[val.length+1][tar + 1];
        int n = dp.length;
        int m = dp[0].length;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(j == 0)
                    dp[i][j] = 0;
                else if(i == 0)
                    dp[i][j] = 0;
                else{
                    int notParticipated = dp[i-1][j];
                    int participated = -1;
                    if(j - wt[i-1] >= 0){
                        participated = dp[i-1][j - wt[i-1]] + val[i-1] ;
                    }
                    dp[i][j] = Math.max(notParticipated, participated);
                }
            }
        }
        
        return dp[n-1][m-1];
    }


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] val = new int[n];
        for(int i = 0; i<n; i++)
            val[i] = scn.nextInt();
            
        int [] wt = new int[n];
        for(int i = 0; i<n; i++)
            wt[i] = scn.nextInt();
            
        int tar = scn.nextInt();
        System.out.println(solve(val, wt, tar));
    }
}