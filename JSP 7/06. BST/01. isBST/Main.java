/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public class pair{
        boolean isBST;
        long max;
        long min;
        pair(){}
        pair(boolean isBST, long max, long min){
            this.isBST = isBST;
            this.max = max;
            this.min = min;
        }
    }
    public pair solve(TreeNode root) {
        if(root == null){
            return new pair(true, Long.MIN_VALUE, Long.MAX_VALUE );
        }
        
        pair la = solve(root.left);
        pair ra = solve(root.right);
        
        pair myPair = new pair();
        
        myPair.isBST = la.isBST && ra.isBST && la.max < root.val && ra.min > root.val;
        myPair.max = Math.max(root.val, ra.max);
        myPair.min = Math.min(root.val, la.min);
        
        return myPair;

    }
//Integer.MIN_VALUE || Integer.MAX_VALUE
    public boolean isValidBST(TreeNode root) {
        pair ans = solve(root);
        return ans.isBST;
    }
}