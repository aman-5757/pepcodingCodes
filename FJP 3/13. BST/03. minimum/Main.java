//https://practice.geeksforgeeks.org/problems/minimum-element-in-bst/1/#

class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        if(node == null)
            return -1;
        
        Node curr = node;
        while(curr.left != null)
            curr = curr.left;
        return curr.data;
    }
}