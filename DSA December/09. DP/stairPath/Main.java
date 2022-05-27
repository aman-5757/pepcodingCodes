import java.io.*;
import java.util.*;

public class Main {

    public static int stairPath(int n, int [] dp){
        if(n == 0){
            return dp[n] = 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int count = 0;
        if(n-1 >= 0){
            count += stairPath(n-1, dp);
        }
        if(n-2 >= 0){
            count += stairPath(n-2, dp);
        }
        if(n-3 >= 0){
            count += stairPath(n-3, dp);
        }
        return dp[n] = count;
    }


    public static int stairPathTab(int N, int [] dp){


        for(int n = 0; n<dp.length; n++){

            if(n == 0){
                dp[n] = 1;
                continue;
            }
            
            int count = 0;
            if(n-1 >= 0){
                count += dp[n-1];//stairPath(n-1, dp);
            }
            if(n-2 >= 0){
                count += dp[n-2];//stairPath(n-2, dp);
            }
            if(n-3 >= 0){
                count += dp[n-3];//stairPath(n-3, dp);
            }
            dp[n] = count;

        }
        return dp[N];

        
    }


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] dp = new int[n+1];
        // int ans = stairPath(n, dp);
        int ans = stairPathTab(n, dp);
        System.out.println(ans);
    }

}