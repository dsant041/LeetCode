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
    public int maxDepth(TreeNode root) {
        
        if (root == null)
            return 0;
        
        int depth = 1;
        
        int left  =  depth + maxDepth(root.left,0);
        
        int right  =  depth + maxDepth(root.right,0);

        if (left > right)
            return left;
        else
            return right;
        
    }
    
    public int maxDepth(TreeNode root, int depth) {
        
        if (root == null)
            return depth;
        
        
        int left  =  maxDepth(root.left,depth+1);
        
        int right  =  maxDepth(root.right,depth+1);

        if (left > right)
            return left;
        else
            return right;
        
    }
}