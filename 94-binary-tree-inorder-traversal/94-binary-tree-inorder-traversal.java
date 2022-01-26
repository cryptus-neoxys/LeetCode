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

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> res = new ArrayList<Integer>();
        TreeNode root1 = root;
        
        while(root1 != null || !st.isEmpty()) {
            while(root1 != null) {
                st.push(root1);
                root1 = root1.left;
            }
            root1 = st.pop();
            res.add(root1.val);
            root1 = root1.right;
        }
        return res;
    }
}