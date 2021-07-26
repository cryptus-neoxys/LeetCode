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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()) {
            int l = q.size();
            List<Integer> temp = new ArrayList();
            while(l-- > 0) {
                TreeNode t = q.remove();
                temp.add(t.val);
                if(t.left != null) q.add(t.left);
                if(t.right != null) q.add(t.right);
            }
            res.add(temp.get(temp.size() - 1));
        }
        return res;
    }
}