import java.io.*;
import java.util.*;

public class Main {

    public static int paintFence(int n, int k, int [][] dp){
        dp[0][2] = k;
        dp[1][2] = k*(k-1);

        for(int i = 3; i<=n; i++){
            dp[0][i] = dp[1][i-1];
            dp[1][i] = (dp[0][i-1] + dp[1][i-1]) * (k-1);
        }
        return dp[0][n] + dp[1][n];
    }


    //space optimization

    public static int paintFence(int n, int k){
        int xx = k;
        int xy = k*(k-1);

        for(int i = 3; i<=n; i++){
            int nxx = xy;
            int nxy = (xx + xy) * (k-1);

            xx = nxx;
            xy = nxy;
        }
        return xx + xy;
    }


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();  

        int [][] dp = new int[2][n+1];


        // int ans = paintFence(n, k, dp);
        int ans = paintFence(n, k);
        System.out.println(ans);


    }
}