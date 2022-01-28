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
    
    private TreeNode r;
    
    public TreeNode find(TreeNode root, int k) {
        if(root == null) return null;
        // System.out.print(root.val + " ");
        if(root.val == k) {
            return root;
        } else if(k < root.val) {
            return find(root.left, k);
        } else {
            return find(root.right, k);
        }
    }
    
    public boolean helper(TreeNode root, int k) {
        if(root != null) {
            // System.out.println("this.r = " + this.r);
            TreeNode t = find(this.r, k - root.val);
            // System.out.println("\n" + root.val + " " + t);
            if(t != null && t.val != root.val) return true;
            return helper(root.left, k) || helper(root.right, k);
        }
        return false;
    }
    
    public boolean findTarget(TreeNode root, int k) {
        this.r = root;
        return helper(root, k);
    }
}