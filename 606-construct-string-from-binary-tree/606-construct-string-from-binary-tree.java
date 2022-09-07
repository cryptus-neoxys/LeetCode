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
    
    private String res;
    
    private void helper(TreeNode root) {
        if(root != null) {
            res += root.val;
            if(root.left != null || root.right != null) res += "(";
            if(root.left != null) {
                helper(root.left);
            }
            if(root.left != null || root.right != null)res += ")";
            if(root.right != null) {
                res += "(";
                helper(root.right);
                res += ")";
            }
        }
    }
    
    public String tree2str(TreeNode root) {
        this.res = "";
        helper(root);
        return res;
    }
}