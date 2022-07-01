class Solution {
    public int numDecodings_(String s, int idx, int [] dp){
        if(idx == s.length()){
            return dp[idx] = 1;
        }
        
        if(dp[idx] != -1)
            return dp[idx];
        
        if(s.charAt(idx) == '0'){
            return dp[idx] = 0;
        }
        
        int count = numDecodings_(s, idx + 1, dp);
        
        if(idx < s.length() - 1 ){
            char c1 = s.charAt(idx);
            char c2 = s.charAt(idx+1);
            
            int num = (c1-'0') * 10 + (c2 - '0');
            if(num <= 26){
                count  += numDecodings_(s, idx + 2, dp);
            }
        }
        return dp[idx] = count;
        
    }
    public int numDecodings(String s) {
        
        int [] dp = new int[s.length()  + 1];
        // Arrays.fill(dp, -1);
        
        return numDecodings_(s, 0, dp);
    }
}