class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;
        while(curr != null){
            if(p.val < curr.val && q.val < curr.val){
                curr = curr.left;
            }
            else if(p.val > curr.val && q.val > curr.val){
                curr = curr.right;
            }
            else{
                //divergent
                return curr;
            }
        }
        
        return null;
    }
}