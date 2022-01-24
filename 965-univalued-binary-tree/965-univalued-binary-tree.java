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
    
    private boolean isUniVal;
    private int rootVal;
    private void helper(TreeNode root) {
        if(root != null) {
            if(root.val != rootVal) {
                isUniVal = false;
                return;
            }
            helper(root.left);
            helper(root.right);
        }
    }
    
    public boolean isUnivalTree(TreeNode root) {
        isUniVal = true; rootVal = root.val;
        helper(root);
        return isUniVal;
    }
}