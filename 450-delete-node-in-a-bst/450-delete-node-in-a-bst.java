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
    
    private TreeNode max(TreeNode root) {
        if(root.right == null) return root;
        return max(root.right);
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) {
            return root;
        }
        
        if(key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if(root.left != null && root.right != null) {
                TreeNode temp = max(root.left);
                root.val = temp.val;
                root.left = deleteNode(root.left, temp.val);
            } else if(root.left != null) {
                return root.left;
            } else if(root.right != null) {
                return root.right;
            } else {
                return null;
            }
        }
        
        return root;
    }
}