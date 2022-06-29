class Solution {
    public int solve(int sr, int sc, int dr, int dc, int [][] dp){
        if(sr == dr && sc == dc){
            return dp[sr][sc] = 1;
        }
        
        if(dp[sr][sc] != 0){
            return dp[sr][sc];
        }
        
        int ans = 0;
        if(sc + 1 <= dc)
            ans += solve(sr,sc+1, dr, dc, dp);
        if(sr + 1 <= dr)
            ans += solve(sr+1,sc, dr, dc, dp);
        
        return dp[sr][sc] = ans;
    }
    
    
    
    public int uniquePaths(int n, int m) {
        int [][] dp = new int[n][m];
        return solve(0,0,n-1, m-1, dp);
    }
}