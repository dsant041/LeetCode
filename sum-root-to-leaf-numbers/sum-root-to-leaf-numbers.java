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
    public int sumNumbers(TreeNode root) {
        
        int total = 0;
        
        if (root == null)
            return 0;
        
        if (root.left == null && root.right == null)
            return root.val;
        
        int left = 0, right = 0;
        
        
        if (root.left != null)
            left = sumNumbers(root.left,""+root.val);
        
        if (root.right != null)
            right = sumNumbers(root.right,""+root.val);
        
        total = Integer.valueOf(left) + Integer.valueOf(right);
        
        return total;
        
        
    }
    
    public int sumNumbers(TreeNode root,String total) {
        
        
        if (root == null)
            return 0;
        
        total = total + "" + root.val;
        
        
        
        if (root.left == null && root.right == null)
            return Integer.valueOf(total);
        
        else{
            
             int left = 0, right = 0;
        
        
            if (root.left != null)
                left = sumNumbers(root.left,total);
        
            if (root.right != null)
                right = sumNumbers(root.right,total);
        
        return Integer.valueOf(left) + Integer.valueOf(right);
        }

        
    }
}