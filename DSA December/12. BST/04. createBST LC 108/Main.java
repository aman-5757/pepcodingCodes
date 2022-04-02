class Solution {
    
    public TreeNode createBST(int [] nums, int i, int j){
        if(i > j){
            return null;
        }
        int mid = (i + j) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createBST(nums, i, mid-1);
        node.right = createBST(nums, mid + 1, j);
        
        return node;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0 )
            return null;
        return createBST(nums, 0, nums.length-1);
    }
}