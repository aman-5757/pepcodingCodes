class Solution {
    long prev = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
            
        boolean la = isValidBST(root.left);
        if(la == false)
            return false;
        
        
        if(prev >= root.val)
            return false;
        prev = root.val;
        
        boolean ra = isValidBST(root.right);
        if(ra == false)
            return false;
        
        
        return true;
    }
}