/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public ArrayList<TreeNode> nodeToRootPath(TreeNode node, int data){
       if(node == null){
            return new ArrayList<>();
        }
        if(node.val == data){
            ArrayList<TreeNode> base = new ArrayList<>();
            base.add(node);
            return base;
        }
        ArrayList<TreeNode> leftAns = nodeToRootPath(node.left, data);
        if(leftAns.size() > 0){
            leftAns.add(node);
            return leftAns;
        }
        ArrayList<TreeNode> rightAns = nodeToRootPath(node.right,data);
        if(rightAns.size()> 0){
            rightAns.add(node);
            return rightAns;
        }
        return new ArrayList<>();
      }

    public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> pN2R = nodeToRootPath(node, p.val);
        ArrayList<TreeNode> qN2R = nodeToRootPath(node, q.val);
        
        int i = pN2R.size()-1;
        int j = qN2R.size()-1;
        TreeNode LCA = null;
        while(i >= 0 && j >= 0){
            if(pN2R.get(i).val != qN2R.get(j).val)
                break;
            LCA = pN2R.get(i);
            i--;
            j--;
        }
        return LCA;
        

    }
}