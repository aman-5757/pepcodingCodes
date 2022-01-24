import java.io.*;
import java.util.*;

public class Main {
    public static int solveR(int [] arr, int src, int dest){
        if(src == dest){
            return 1;
        }  
        int count = 0;
        for(int jump = 1; jump<=arr[src] && jump + src <= dest; jump++){
            count += solveR(arr, src + jump, dest);
        }
        return count;
    }


    public static int solveM(int [] arr, int src, int dest, int [] dp){
        if(src == dest){
            return dp[src] = 1;
        }
        if(dp[src] != 0)
            return dp[src];
            
        int count = 0;
        for(int jump = 1; jump<=arr[src] && jump + src <= dest; jump++){
            count += solveM(arr, src + jump, dest, dp);
        }
        return dp[src] = count;
    }

    public static int solveT(int [] arr, int SRC, int dest, int [] dp){
        for(int src = dp.length-1; src >= SRC; src--){
            if(src == dest){
                dp[src] = 1;
                continue;
            }
            
            int count = 0;
            for(int jump = 1; jump<=arr[src] && jump + src <= dest; jump++){
                count += dp[src+jump];//solveM(arr, src + jump, dest, dp);
            }
               dp[src] = count;
            }
            return dp[SRC];
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int [] dp = new int[n+1];
        // int ans = solveM(arr, 0, n, dp);
        int ans = solveT(arr, 0, n, dp);
        System.out.println(ans);
    }

}