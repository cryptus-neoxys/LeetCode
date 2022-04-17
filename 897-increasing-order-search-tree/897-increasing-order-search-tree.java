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
    public TreeNode increasingBST(TreeNode root) {
        return helper(root, null);        
    }
    
    private TreeNode helper(TreeNode r, TreeNode l) {
        if(r != null) {
            TreeNode res = helper(r.left, r);
            r.left = null;;
            r.right = helper(r.right, l);
            return res;
        } return l;
    }
}