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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root == null) return res;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean z = false;
        while(!q.isEmpty()) {
            List<Integer> t = new ArrayList<>();
            int len = q.size();
            
            for(int i = 0; i< len; ++i) {
                TreeNode temp = q.remove();
                if(z) {
                    t.add(0, temp.val);
                } else {
                    t.add(temp.val);
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            res.add(t); z = !z;
        }
        return res;
    }
}