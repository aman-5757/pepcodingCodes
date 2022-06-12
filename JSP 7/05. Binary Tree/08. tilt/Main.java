class Solution {
    static int tilt;
    
    public int sum(TreeNode root){
        if(root == null)
            return 0;
        
        int la = sum(root.left);
        int ra = sum(root.right);
        
        tilt += Math.abs(la-ra);
        
        return la + ra + root.val;
    }
    //pair -- self
    
    public int findTilt(TreeNode root) {
        tilt = 0;
        sum(root);
        return tilt;
    }
}