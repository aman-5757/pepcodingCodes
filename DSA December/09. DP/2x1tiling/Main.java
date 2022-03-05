import java.io.*;
import java.util.*;

public class Main {

    //recursive
    // public static int tiling(int n){
    //     if(n <= 1){
    //         return 1;
    //     }

    //     int horizontal = tiling(n-2);
    //     int vertical = tiling(n-1);/

    //     int myAns = horizontal + vertical;

    //     return myAns;
    // }

    public static int tiling(int n, int [] dp){
        if(n <= 1){
            return dp[n] = 1;
        }

        if(dp[n] != 0)
            return dp[n];

        int horizontal = tiling(n-2, dp);
        int vertical = tiling(n-1, dp);

        int myAns = horizontal + vertical;

        return dp[n] = myAns;
    }


    public static int tilingTab(int N, int [] dp){
        for(int n = 0; n<dp.length; n++){
            if(n <= 1){
                dp[n] = 1;
                continue;
            }

            

            int horizontal = dp[n-2];//tiling(n-2, dp);
            int vertical = dp[n-1];//tiling(n-1, dp);

            int myAns = horizontal + vertical;

            dp[n] = myAns;
        }
        return dp[N];
    }

    public static int tilingDirectTab(int n){
        int [] dp = new int[n+1];
        dp[1] = 1;
        dp[0] = 1;
        for(int i = 2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static int tilingOpti(int n){
        
        int p = 1;
        int sp = 1;

        for(int i = 2; i<=n; i++){
            int c = p + sp;
            sp = p;
            p = c;
        }
        return p;
    }


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] dp = new int[n+1];
        // int ans = tiling(n, dp);


        // int ans = tilingTab(n,dp);
        int ans = tilingDirectTab(n);
        System.out.println(ans);


    }
}