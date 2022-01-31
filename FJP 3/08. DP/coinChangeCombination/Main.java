import java.io.*;
import java.util.*;

public class Main {
    
    public static int coinChangeCombination(int [] arr, int amt){
        int [] dp = new int[amt+1];
        dp[0] = 1;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<dp.length; j++){
                if( j - arr[i] >= 0 ){
                    dp[j] += dp[j - arr[i]];
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
        int ans = coinChangeCombination(arr, amt);
        System.out.println(ans);
    }
}