import java.io.*;
import java.util.*;

public class Main {
    public static boolean solve(int [] arr, int tar){
        boolean [][] dp = new boolean[arr.length+1][tar + 1];
        int n = dp.length;
        int m = dp[0].length;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(j == 0)
                    dp[i][j] = true;
                else if(i == 0)
                    dp[i][j] = false;
                else{
                    boolean notParticipated = dp[i-1][j];
                    boolean participated = false;
                    if(j - arr[i-1] >= 0){
                        participated = dp[i-1][j - arr[i-1]];
                    }
                    dp[i][j] = notParticipated || participated;
                }
            }
        }
        
        return dp[n-1][m-1];
    }


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = scn.nextInt();
        int tar = scn.nextInt();
        System.out.println(solve(arr, tar));
    }
}