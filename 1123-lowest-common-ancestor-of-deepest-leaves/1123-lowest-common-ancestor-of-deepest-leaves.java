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
    
    private TreeNode lca(TreeNode root, Set nodes) {
        if(root != null) {
            if(nodes.contains(root)) return root;
            TreeNode leftLCA = lca(root.left, nodes);
            TreeNode rightLCA = lca(root.right, nodes);
            if(leftLCA == null) return rightLCA;
            if(rightLCA == null) return leftLCA;
            else return root;
        }
        return null;
    }
    
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        Set<TreeNode> set = new HashSet<>();
        
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            int s = q.size();
            set.clear();
            while(s-- > 0) {
                TreeNode node = q.poll();
                set.add(node);
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
        }
        
        return lca(root, set);
    }
}