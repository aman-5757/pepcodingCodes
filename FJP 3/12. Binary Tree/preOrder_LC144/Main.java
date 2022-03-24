class Solution {
    
    public void preOrder(TreeNode root, List<Integer> ans){
        if(root == null)
            return;
        ans.add(root.val);
        preOrder(root.left, ans);
        preOrder(root.right, ans);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preOrder(root, ans);
        return ans;
    }
}