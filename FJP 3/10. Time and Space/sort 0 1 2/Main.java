class Solution {
    public void swap(int [] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int k = n-1;
        
        
        while(j <= k ){
            int val = nums[j];
            
            if(val == 0){
                swap(nums, i, j);
                i++;
                j++;
            }
            else if(val == 1){
                j++;
            }
            else{
                //val --> 2
                swap(nums, j, k);
                k--;
            }
        }
    }
}