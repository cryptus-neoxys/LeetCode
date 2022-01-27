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
    
    public void helper(TreeNode root, int val) {
        if(val < root.val) {
            if(root.left != null) helper(root.left, val);
            else {
                root.left = new TreeNode(val);
                return;
            }
        } else {
            if(root.right != null) helper(root.right, val);
            else {
                root.right = new TreeNode(val);
                return;
            }
        }
    }
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(val < root.val) {
            if(root.left != null) root.left = insertIntoBST(root.left, val);
            else {
                root.left = new TreeNode(val);
            }
        } else {
            if(root.right != null) root.right = insertIntoBST(root.right, val);
            else {
                root.right = new TreeNode(val);
            }
        }
        return root;
    }
}