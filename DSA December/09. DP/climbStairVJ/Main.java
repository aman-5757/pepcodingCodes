import java.io.*;
import java.util.*;

public class Main {


    

    public static int climbStairVJR(int src, int dest, int [] arr){
        if(src == dest){
            return 1;
        }
        int count = 0;
        for(int jump = 1; jump <= arr[src] && jump + src <= dest; jump++){
            count += climbStairVJR(src + jump, dest, arr);
        }
        return count;
    }
    
    public static int climbStairVJMemo(int src, int dest, int [] arr, int [] dp){
        if(src == dest){
            return dp[src] = 1;
        }
        if(dp[src] != 0)
            return dp[src];

        int count = 0;
        for(int jump = 1; jump <= arr[src] && jump + src <= dest; jump++){
            count += climbStairVJMemo(src + jump, dest, arr, dp);
        }
        return dp[src] = count;
    }


    public static int climbStairVJTab(int SRC, int dest, int [] arr, int [] dp){

        for(int src = dp.length-1; src>= 0; src-- ){
            if(src == dest){
                dp[src] = 1;
                continue;
            }
            

            int count = 0;
            for(int jump = 1; jump <= arr[src] && jump + src <= dest; jump++){
                count += dp[src+jump];
            }
            dp[src] = count;
        }
        return dp[SRC];
        
    }


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = scn.nextInt();


        int [] dp = new int[n+1];

        // int ans = climbStairVJR(0, n, arr);
        // int ans = climbStairVJMemo(0, n, arr, dp);
        int ans = climbStairVJTab(0, n, arr, dp);
        System.out.println(ans);
    }

}