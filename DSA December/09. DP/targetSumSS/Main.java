import java.io.*;
import java.util.*;

public class Main {

    public static boolean tarSum(int [] arr, boolean [][] dp){
        for(int i = 0; i<dp.length; i++){
            for(int j = 0; j<dp[0].length; j++){
                if(j == 0)
                    dp[i][j] = true;
                else if(i == 0)
                    dp[i][j] = false;
                else{
                    //real game
                    boolean notPlayed = dp[i-1][j];

                    boolean played = false;
                    if(j - arr[i-1] >= 0){
                        played = dp[i-1][j-arr[i-1]];
                    }

                    dp[i][j] = played || notPlayed;
                }
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        boolean [][] dp = new boolean[n+1][tar+1];
        boolean ans = tarSum(arr, dp);
        System.out.println(ans);

    }
}