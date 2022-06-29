class Solution {
    public int climbStairs_tab(int N, int [] dp){
        for(int n = 0; n<dp.length; n++){
            if(n == 0){
                dp[n] = 1;
                continue;
            }

            
            int ans = 0;

            if(n-1 >= 0)
                ans += dp[n-1] ;//climbStairs_rec(n-1, dp);
            if(n-2 >= 0)
                ans += dp[n-2]; //climbStairs_rec(n-2, dp);

             dp[n] = ans;
        }
        return dp[N];
    }
    
    
    public int climbStairs_rec(int n, int [] dp){
        if(n == 0){
            return dp[n] = 1;
        }
        
        if(dp[n] != 0)
            return dp[n];
        
        int ans = 0;
        
        if(n-1 >= 0)
            ans += climbStairs_rec(n-1, dp);
        if(n-2 >= 0)
            ans += climbStairs_rec(n-2, dp);
        
        return dp[n] = ans;
        
    }
    public int climbStairs(int n) {
        int [] dp = new int[n+1];
        
        return climbStairs_tab(n, dp);
    }
}