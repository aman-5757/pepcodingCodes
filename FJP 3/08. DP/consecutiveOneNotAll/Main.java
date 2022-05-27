// https://www.geeksforgeeks.org/count-possible-ways-to-construct-buildings/

class Solution {
    static int mod = (int)1e9+7;
    long countStrings(int n) {
        long oldCountZero = 1;
        long oldCountOne = 1;
        
        for(int i = 2; i<= n; i++){
            long nCountZero = (oldCountZero + oldCountOne)% mod;
            long nCountOne = oldCountZero;
            
            
            oldCountZero = nCountZero;
            oldCountOne = nCountOne;
        }
        
        return ((oldCountZero + oldCountOne) % mod);
    }
}