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
    private int K;
    private int helper(TreeNode root) {
        if(root == null) return -1;
        int ls = helper(root.left);
        if(ls != -1) return ls;
        K -= 1;
        if(K == 0) return root.val;
        return helper(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        K = k;
        return helper(root);
    }
}