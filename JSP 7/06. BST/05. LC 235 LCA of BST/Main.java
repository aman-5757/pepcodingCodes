class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode lca = root;
        while(lca != null){
            if(p.val < lca.val && q.val < lca.val){
               lca = lca.left;
            }
            else if(p.val > lca.val && q.val > lca.val){
                lca = lca.right;
            }
            else{
                return lca;
            }
        }
        return null;
    }
}