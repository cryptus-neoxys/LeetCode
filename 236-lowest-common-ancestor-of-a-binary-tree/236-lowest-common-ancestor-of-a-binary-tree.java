/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root != null) {
            if(root.val == p.val || root.val == q.val) return root;
            TreeNode leftNodeLCA = lowestCommonAncestor(root.left, p, q);
            TreeNode rightNodeLCA = lowestCommonAncestor(root.right, p, q);
            if(rightNodeLCA == null) return leftNodeLCA;
            else if(leftNodeLCA == null) return rightNodeLCA;
            return root;
            // if(root == p || root == q) return 
        }
        return null;
    }
}