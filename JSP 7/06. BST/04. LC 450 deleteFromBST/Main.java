class Solution {
    
    public int min(TreeNode node){
        TreeNode temp = node;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp.val;
        
    }
    
    
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        
        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.val){
            root.right = deleteNode(root.right, key);
        }
        
        else{
            //this should be removed
            
            // 0child,1child,2child
            if(root.left == null && root.right == null){
                return null;
            }
            
            if((root.left != null && root.right == null) || (root.right!= null && root.left == null)   ){
                return root.left != null ? root.left : root.right;
            }
            
            //2child
            int minElement = min(root.right);
            root.val = minElement;
            root.right = deleteNode(root.right, minElement);
            

        }
        return root;
    }
}