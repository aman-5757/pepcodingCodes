import java.util.*;

public class Main{
    public static int fibo_rec(int n){
        if(n <= 1){
            return n;
        }
        int nm1 = fibo_rec(n-1);
        int nm2 = fibo_rec(n-2);

        return nm1 + nm2;
    }


    // memo
    public static int fibo(int n, int [] dp){
        if(n <= 1){
             return  dp[n] = n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        int nm1 = fibo(n-1, dp);
        int nm2 = fibo(n-2, dp);

        return dp[n] =  nm1 + nm2;
    }
    //tab
     public static int fiboTab(int N, int [] dp){
        for(int n = 0 ; n<dp.length; n++){

            if(n <= 1){
                 dp[n] = n;
                 continue;
            }
            int nm1 = dp[n-1];//fibo(n-1, dp);
            int nm2 = dp[n-2];//fibo(n-2, dp);
            dp[n] =  nm1 + nm2;
        }
        return dp[N];
    }

    public static int fiboRegular(int n, int [] dp){
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static int fiboOpti(int n){
       int a  = 0;
       int b = 1;

        for(int i = 2; i <= n; i++){

            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String [] args){
        int n = 10000;
        // int ans = fibo_rec(n);

        int [] dp = new int[n+1];

        // int ans1 = fibo(n, dp);
        int ans2 = fiboTab(n, dp);
        System.out.println(ans2);
    }
}