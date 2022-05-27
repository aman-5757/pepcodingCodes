import java.io.*;
import java.util.*;

public class Main {
    public static int waysTabCon(int N , int [] dp){
        for(int n = 0; n<=N; n++){
             if(n <= 2){
                dp[n] = n;
                continue;
            }
            
            dp[n] = dp[n-1] + dp[n-2];
        }
        return dp[N];
    }

    public static int ways(int n, int [] dp){
        if(n <= 2){
            return dp[n] = n;
        }
        if(dp[n] != 0){
            return dp[n];
        }

        return dp[n] = ways(n-1, dp) + ways(n-2 , dp);
    }


    public static int waysTab(int n){
        int [] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<=n; i++)
            dp[i] = dp[i-1] + dp[i-2];
        return dp[n];
    }

    public static int waysOpti(int n){
        
        int one = 1;
        int two = 2;
        for(int i = 3; i<=n; i++)
            {
                int myAns = one + two;
                one = two;
                two = myAns;
            }
        return two;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] dp = new int[n+1];
        // int ans = waysTabCon(n, dp);
        int ans = waysOpti(n);
        System.out.println(ans);
    }
}