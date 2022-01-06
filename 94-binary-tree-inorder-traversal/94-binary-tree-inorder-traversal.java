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
    private List<Integer> res;
    
    public void helper(TreeNode root) {
        if(root == null) return;
        helper(root.left);
        this.res.add(root.val);
        // System.out.println(root.val);
        helper(root.right);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        this.res = new ArrayList<Integer>();
        helper(root);
        return this.res;
    }
}