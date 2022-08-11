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
    private boolean res;
    private TreeNode pre;
    
    private boolean inord(TreeNode root, long min, long max) {
        if(root == null) return true;
        
        if((long)(root.val) >= max || (long)(root.val) <= min) return false;
        return (inord(root.left, min, Math.min(max, (long)(root.val))) && inord(root.right, Math.max((long)(root.val), min), max));
    }
    
    public boolean isValidBST(TreeNode root) {
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        return inord(root, min, max);
    }
}