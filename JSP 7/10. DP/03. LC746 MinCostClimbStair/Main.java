class Solution {
    public int solve(int n, int [] cost, int [] dp){
        if(n <= 1){
            //base
            return dp[n] = cost[n];
        }
        
        if(dp[n] != 0)
            return dp[n];
        
        int ans = Math.min(solve(n-1, cost, dp), solve(n-2, cost, dp));
        ans += (n==cost.length) ? 0 : cost[n];
        
        return dp[n] = ans;
    }
    
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        int [] dp = new int[n+1];
        return solve(n, cost, dp);
        
    }
}