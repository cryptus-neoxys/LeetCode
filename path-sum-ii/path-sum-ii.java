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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        helper(root, targetSum, path, res);
        
        return res;
    }
    
    public void helper(TreeNode r, int s, List<Integer> path, List<List<Integer>> res) {
        if(r == null) return;
        path.add(r.val);
        
        if(r.right == null && r.left == null) {
            if(r.val == s)
                res.add(new ArrayList<Integer>(path));
            return;
        }
        
        if(r.left != null) {
        helper(r.left, s-r.val, path, res);
        path.remove(path.size() - 1);
        }
        if(r.right != null) {
        helper(r.right, s-r.val, path, res);
        path.remove(path.size() - 1);
        }
    }
}