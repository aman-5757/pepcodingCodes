import java.io.*;
import java.util.*;

public class Main {

    public static int coinChangeComb(int [] coins, int tar){
        int [] dp = new int[tar + 1];
        dp[0] = 1;
        for(int d = 0; d < dp.length; d++){
            for(int c = 0; c < coins.length; c++){
                if(d - coins[c] >= 0){      //pay
                    dp[d] += dp[d-coins[c]];
                }
            }
        }

        return dp[tar];

    }



    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] coins = new int[n];
        for(int i = 0; i<n; i++)
            coins[i] = scn.nextInt();
        
        int tar = scn.nextInt();
        int ans = coinChangeComb(coins, tar);
        System.out.println(ans);
    }
}