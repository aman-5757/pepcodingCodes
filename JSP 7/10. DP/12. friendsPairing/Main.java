import java.io.*;
import java.util.*;

public class Main {
    public static int solve(int n, int [] dp){
        if(n <= 2){
            return dp[n] = n;
        }
        if(dp[n] != 0)
            return dp[n];
        
        int singleWays = solve(n-1, dp);
        int pairWays = solve(n-2, dp) * (n-1);
        
        return dp[n] = singleWays + pairWays;
    }


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] dp = new int[n+1];
        System.out.println(solve(n, dp));
    }

}