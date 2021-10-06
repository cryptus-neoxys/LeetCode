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
    int sum;
    
    public void dfs(TreeNode root, int res) {
        if(root == null) return;
        
        res = res * 10 + root.val;
        if(root.left == null && root.right == null) sum += res;
        
        dfs(root.left, res);
        dfs(root.right, res);
        res = res / 10;
    }
    
    public int sumNumbers(TreeNode root) {
        sum = 0;
        dfs(root, 0);
        return sum;
    }
}