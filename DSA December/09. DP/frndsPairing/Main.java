import java.io.*;
import java.util.*;

public class Main {

    public static int frndsPairing(int n){
        if(n <= 2){
            return n;
        }

        int single = frndsPairing(n-1);
        int pairUp = frndsPairing(n-2) * (n-1);

        int myAns = single + pairUp;
        return myAns;
    }


    public static int frndsPairingMemo(int n, int [] dp){
        if(n <= 2){
            return dp[n] = n;
        }

        if(dp[n] != 0)
            return dp[n];

        int single = frndsPairingMemo(n-1, dp);
        int pairUp = frndsPairingMemo(n-2, dp) * (n-1);

        int myAns = single + pairUp;
        return dp[n] = myAns;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // int ans = frndsPairing(n);
        int [] dp = new int[n+1];
        int ans = frndsPairingMemo(n, dp);
        System.out.println(ans);
    }

}