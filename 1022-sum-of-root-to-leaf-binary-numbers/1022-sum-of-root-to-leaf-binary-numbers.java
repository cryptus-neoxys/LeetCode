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
    
    private int inord(TreeNode root, int sum) {
        if(root == null) return 0;
        
        sum = (sum << 1) + root.val;
        
        if(root.left == null && root.right == null) return sum;
        
        return inord(root.left, sum) + inord(root.right, sum);
    }
    
    public int sumRootToLeaf(TreeNode root) {
        return inord(root, 0);
    }
}