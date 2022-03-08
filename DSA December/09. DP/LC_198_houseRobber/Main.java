class Solution {
    public int robMemo(int n, int [] nums, int [] dp){
        if(n == 0){
            dp[n] = nums[n];
        }
        else if(n == 1){
            dp[n] = Math.max(nums[0], nums[1]);
        }
        
        if(dp[n] != -1){
            return dp[n];
        }
        
        int rob = nums[n] + robMemo(n-2, nums, dp);
        int notRob = robMemo(n-1, nums, dp);
        
        return dp[n] = Math.max(rob, notRob);
    }
    
    public int rob(int[] nums) {
        
        int n = nums.length; // I will use this as idx
        int [] dp = new int[n];
        // for(int i = 0; i<n; i++){
        //     dp[i] = -1;
        // }
        Arrays.fill(dp,-1);
        return robMemo(n-1, nums, dp);
    }
}