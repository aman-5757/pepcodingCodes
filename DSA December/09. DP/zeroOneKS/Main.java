import java.io.*;
import java.util.*;

public class Main {

    public static int knapSack(int [] pa, int [] wa, int [][] dp){
        for(int i = 0; i<dp.length; i++){
            for(int j = 0; j<dp[0].length; j++){
                if(j == 0)
                    dp[i][j] = 0;
                else if(i == 0)
                    dp[i][j] = 0;
                else{
                    //real game
                    int notPick = dp[i-1][j];

                    int pick = -1;
                    if(j - wa[i-1] >= 0){
                        pick = dp[i-1][j-wa[i-1]]  + pa[i-1] ;
                    }

                    dp[i][j] = Math.max(pick, notPick);
                }
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }

    public static void main(String[] args) throws Exception {
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] pa = new int[n];
        for(int i = 0; i<n; i++){
            pa[i] = scn.nextInt();
        }
        int [] wa = new int[n];
        for(int i = 0; i<n; i++){
            wa[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        int [][] dp = new int[n+1][tar+1];
        int ans = knapSack(pa, wa, dp);
        System.out.println(ans);
    }
}