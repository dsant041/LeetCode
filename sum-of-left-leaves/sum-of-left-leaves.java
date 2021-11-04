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
    public int sumOfLeftLeaves(TreeNode root) {
        
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 0;
        
        int total = 0;
        
         if (root.left != null){
            if (root.left.left == null && root.left.right == null)
                total = total + root.left.val;
            
            total = sumOfLeftLeaves(root.left,total);
        }
            
        if (root.right != null)
            total = sumOfLeftLeaves(root.right,total);
            
        return total;
        
        
    }
    
    public int sumOfLeftLeaves(TreeNode root, int total) {
        
        if (root == null)
            return total;
        //if (root.left == null && root.right == null)
          //return total;
        
        if (root.left != null){
            if (root.left.left == null && root.left.right == null)
                total = total + root.left.val;
            
            total = sumOfLeftLeaves(root.left,total);
        }
            
        if (root.right != null)
            total = sumOfLeftLeaves(root.right,total);
            
        return total;
        
        
        /*
        if (root.left == null && root.right == null)
            return total;
        if (root.left != null){
            if (root.left.left == null && root.left.right == null){
                total = total + root.left.val;
                return sumOfLeftLeaves(root.right,total);
            }
            else{
                total = sumOfLeftLeaves(root.left,total);
                total = sumOfLeftLeaves(root.right,total);
                return total;
            }
        }
        
        else{
            return sumOfLeftLeaves(root.right,total);
        }
            */

        
    }
}