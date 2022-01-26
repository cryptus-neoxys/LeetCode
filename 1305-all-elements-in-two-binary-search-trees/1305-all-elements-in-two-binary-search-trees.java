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
    
    private List<Integer> arr;
    
    private void helper(TreeNode root, List tree) {
        if(root != null) {
            helper(root.left, tree);
            tree.add(root.val);
            helper(root.right, tree);
        }
    }
    
    private List<Integer> merge(List<Integer> tree1, List<Integer> tree2) {
        List<Integer> res = new ArrayList<Integer>();
        
        int p = 0, q = 0, m = tree1.size(), n = tree2.size();
        
        while(p < m && q < n) {
            if(tree1.get(p) < tree2.get(q)) {
                res.add(tree1.get(p));
                p++;
            } else {
                res.add(tree2.get(q));
                q++;
            }
        }
        
        while(p < m) {
            res.add(tree1.get(p++));
        }
        
        while(q < n) {
            res.add(tree2.get(q++));
        }
        
        return res;
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> tree1 = new ArrayList<Integer>();
        List<Integer> tree2 = new ArrayList<Integer>();
        
        helper(root1, tree1);
        helper(root2, tree2);
        
        List<Integer> tree = merge(tree1, tree2);
        
        return tree;
    }
}