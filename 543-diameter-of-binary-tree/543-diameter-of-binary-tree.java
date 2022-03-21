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
    
    int maxDiameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        if (root == null)
            return 0;
        
        int diameter = diameterOfBinaryTree(root, 0);
        
        return maxDiameter;

        
    }
    
    public int diameterOfBinaryTree(TreeNode root, int maxHeight) {
        
        if (root == null)
            return 0;
        
        int leftHeight = diameterOfBinaryTree(root.left, maxHeight);
        int rightHeight = diameterOfBinaryTree(root.right, maxHeight);
        
        if (leftHeight + rightHeight > maxDiameter)
            maxDiameter = leftHeight + rightHeight;
        
        if (leftHeight > rightHeight)
            return leftHeight + 1;
        else
            return rightHeight + 1;
        
    }
}