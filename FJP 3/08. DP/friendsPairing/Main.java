import java.io.*;
import java.util.*;

public class Main {

    public static int friendsPairing(int n, int [] dp)
    {
        if(n <= 2){
            return dp[n] = n;
        }

        if(dp[n] != 0)
            return dp[n];

        int single = friendsPairing(n-1, dp);
        int pair = friendsPairing(n-2, dp);

        return dp[n] = single + (n-1)*pair;

    }

     public static int friendsPairingTab(int N, int [] dp)
    {
        for(int n = 0; n<= N; n++){
            if(n <= 2){
                dp[n] = n;
                continue;
            }

           

            int single = dp[n-1];
            int pair = dp[n-2];

            dp[n] = single + (n-1)*pair;
        }
        return dp[N];

    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] dp = new int[n+1];
        int ans = friendsPairingTab(n, dp);
        System.out.println(ans);
    }

}