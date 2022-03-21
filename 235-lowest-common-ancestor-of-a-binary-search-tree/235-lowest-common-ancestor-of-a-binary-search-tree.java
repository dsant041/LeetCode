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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if (root == null)
            return null;
        
        /*
        if (root == p && (p.right == q || p.left == q))
            return p;
        else if (root == q && (q.right == p || q.left == p))
            return q;
            */
        
        if ((p.val <= root.val && q.val >= root.val) || (q.val <= root.val && p.val >= root.val))
            return root;
        
        if (p.val <= root.val && q.val <= root.val)
            return lowestCommonAncestor(root.left, p, q);
        else
            return lowestCommonAncestor(root.right, p, q);
        
        
        
        
    }
}