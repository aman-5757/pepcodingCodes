import java.io.*;
import java.util.*;

public class Main {
    public static int solve(int [] arr, int amt){
        int [] dp = new int[amt + 1];
        dp[0] = 1;
        for(int coin : arr){
            for(int i = 1; i<dp.length; i++){
                if(i - coin >= 0){
                    dp[i] += dp[i-coin];
                }
            }
        }
        return dp[amt];
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = scn.nextInt();
        int amt = scn.nextInt();
        System.out.println(solve(arr, amt));
    }
}