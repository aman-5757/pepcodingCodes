class Solution {
    private TreeNode task(TreeNode root, int tar) {
        if(root == null) return null;
        root.left = task(root.left, tar);
        root.right = task(root.right, tar);
        
        if(root.val == tar && root.left == null && root.right == null){
            return null;
        }
        return root;
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        root = task(root, target);
        return root;
    }
}